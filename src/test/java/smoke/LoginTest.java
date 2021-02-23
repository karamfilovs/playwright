package smoke;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class LoginTest
{
    @Test
    public void canLoginWithValidCreds()
    {
        Browser browser = Playwright.create()
                .chromium()
                .launch(new BrowserType.LaunchOptions().withHeadless(false));

        Page page = browser.newPage();
        page.navigate("https://st2016.inv.bg");
        page.fill("#loginusername", "karamfilovs@gmail.com");
        page.fill("#loginpassword", "123456");
        page.click("#loginsubmit");

        assertThat(page.isVisible("button#createRoom"), is(true));
    }
}
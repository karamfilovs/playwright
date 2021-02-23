package smoke;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Test;



public class LoginPageRawTest
{
    @Test
    public void canLoginWithValidCreds()
    {
        Browser browser = Playwright.create()
                .chromium()
                .launch(new BrowserType.LaunchOptions().withHeadless(false));

        Page page = browser.newPage();
        page.setViewportSize(1920, 1080);
        page.navigate("https://st2016.inv.bg");
        page.fill("#loginusername", "karamfilovs@gmail.com");
        page.fill("#loginpassword", "123456");
        page.click("#loginsubmit");

    }
}
package base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import pages.playwright.App;

public class TestSetupPlayWright {
    protected App app;
    private static final String BASE_URL = "https://st2016.inv.bg";
    private Browser browser;
    private Page page;

    @BeforeEach
    public void setUp(TestInfo testInfo) {
        System.out.println("Starting test:" + testInfo.getDisplayName());
        browser = Playwright.create()
                .chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(true));
        page = browser.newPage();
        page.navigate(BASE_URL);
        app = new App(page);
    }

    @AfterEach
    public void tearDown() {
        browser.close();
    }
}

package pages.playwright;

import com.microsoft.playwright.Page;

public class App {
    private Page page;
    public LoginPage loginPage;
    public HomePage homePage;

    public App(Page page) {
        this.page = page;
        loginPage = new LoginPage(page);
        homePage = new HomePage(page);
    }


}

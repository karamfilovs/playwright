package pages.playwright;

import com.microsoft.playwright.Page;

public class HomePage extends BasePage {
    private String URL = "/home";
    private String PAGE_TITLE = "home";
    private String userPanelSelector = "#userpanel";
    private String logoutLinkSelector = "//a[@class='selenium-button-logout button-logout']";


    public HomePage(Page page) {
        super(page);
    }

    public String getUserPanelText(){
        return getText(userPanelSelector).trim();
    }

    public HomePage logout() {
        click(userPanelSelector);
        click(logoutLinkSelector);
        return this;
    }

}

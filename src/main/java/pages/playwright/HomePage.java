package pages.playwright;

import com.microsoft.playwright.Page;

public class HomePage extends BasePage {
    private String url = "/home";
    private String pageTitle = "/home";
    private String userPanel = "#userpanel";


    public HomePage(Page page) {
        super(page);
    }

    public String getUserPanelText(){
        return getText(userPanel).trim();
    }


}

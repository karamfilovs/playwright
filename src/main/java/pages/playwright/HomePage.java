package pages.playwright;

import com.microsoft.playwright.Page;

public class HomePage extends BasePage {
    private String URL = "/home";
    private String PAGE_TITLE = "home";
    private String userPanel = "#userpanel";


    public HomePage(Page page) {
        super(page);
    }

    public String getUserPanelText(){
        return getText(userPanel).trim();
    }


}

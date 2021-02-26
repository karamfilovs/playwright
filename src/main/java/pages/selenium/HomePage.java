package pages.selenium;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private String url = "/home";
    private String pageTitle = "Home";
    private String userPanel = "#userpanel";


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getUserPanelText() {
        return getText(userPanel).trim();
    }

}

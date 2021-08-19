package pages.playwright;

import com.microsoft.playwright.Page;

public class LoginPage extends BasePage {
    private String inputUsernameSelector = "#loginusername";
    private String inputPasswordSelector = "#loginpassword";
    private String buttonLoginSelector = "#loginsubmit";

    public LoginPage(Page page) {
        super(page);
    }

    public LoginPage populateUsername(String username) {
        System.out.println("Entering username:" + username);
        typeText(inputUsernameSelector, username);
        return this;
    }

    public LoginPage populatePassword(String password) {
        System.out.println("Entering password:" + password);
        typeText(inputPasswordSelector, password);
        return this;
    }

    public LoginPage pressLoginButton() {
        System.out.println("Clicking Login button");
        click(buttonLoginSelector);
        return this;
    }


}

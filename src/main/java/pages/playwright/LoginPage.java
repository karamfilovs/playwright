package pages.playwright;

import com.microsoft.playwright.Page;

public class LoginPage extends BasePage {
    private String inputUsername = "#loginusername";
    private String inputPassword = "#loginpassword";
    private String buttonLogin = "#loginsubmit";

    public LoginPage(Page page) {
        super(page);
    }

    public LoginPage populateUsername(String username) {
        System.out.println("Entering username:" + username);
        typeText(inputUsername, username);
        return this;
    }

    public LoginPage populatePassword(String password) {
        System.out.println("Entering password:" + password);
        typeText(inputPassword, password);
        return this;
    }

    public LoginPage pressLoginButton() {
        System.out.println("Clicking Login button");
        click(buttonLogin);
        return this;
    }


}

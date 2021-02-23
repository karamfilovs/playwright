package pages;

import com.microsoft.playwright.Page;

public class LoginPage {

    private Page page;
    private String inputUsername = "#loginusername";
    private String inputPassword = "#loginpassword";
    private String buttonLogin = "#loginsubmit";

    public LoginPage(Page page) {
        this.page = page;
    }

    public LoginPage populateUsername(String username) {
        page.fill(inputUsername, username);
        return this;
    }

    public LoginPage populatePassword(String password) {
        page.fill(inputPassword, password);
        return this;
    }


}

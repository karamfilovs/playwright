package smoke.playwright;

import base.TestSetupPlayWright;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class LoginPageTest extends TestSetupPlayWright {

    @Test
    @DisplayName("Can login with valid credentials - Playwright")
    public void canLoginWithValidCredentials() {
        app.loginPage
                .populateUsername("karamfilovs@gmail.com")
                .populatePassword("123456")
                .pressLoginButton();
        Assertions.assertEquals("karamfilovs@gmail.com", app.homePage.getUserPanelText());
    }

    @Test
    @DisplayName("Can login with valid credentials - Playwright2")
    public void canLoginWithValidCredentials2() {
        app.loginPage
                .populateUsername("karamfilovs@gmail.com")
                .populatePassword("123456")
                .pressLoginButton();
        Assertions.assertEquals("karamfilovs@gmail.com", app.homePage.getUserPanelText());
    }

    @Test
    @DisplayName("Can login with valid credentials - Playwright3")
    public void canLoginWithValidCredentials3() {
        app.loginPage
                .populateUsername("karamfilovs@gmail.com")
                .populatePassword("123456")
                .pressLoginButton();
        Assertions.assertEquals("karamfilovs@gmail.com", app.homePage.getUserPanelText());
    }

    @Test
    @DisplayName("Can login with valid credentials - Playwright4")
    public void canLoginWithValidCredentials4() {
        app.loginPage
                .populateUsername("karamfilovs@gmail.com")
                .populatePassword("123456")
                .pressLoginButton();
        Assertions.assertEquals("karamfilovs@gmail.com", app.homePage.getUserPanelText());
    }

    @Test
    @DisplayName("Can login with valid credentials - Playwright5")
    public void canLoginWithValidCredentials5() {
        app.loginPage
                .populateUsername("karamfilovs@gmail.com")
                .populatePassword("123456")
                .pressLoginButton();
        Assertions.assertEquals("karamfilovs@gmail.com", app.homePage.getUserPanelText());
    }
}

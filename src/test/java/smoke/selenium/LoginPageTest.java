package smoke.selenium;

import base.TestSetupSelenium;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class LoginPageTest extends TestSetupSelenium {
    @Test
    @DisplayName("Can login with valid credentials - Selenium")
    public void canLoginWithValidCredentials() {
        app.loginPage
                .populateUsername("karamfilovs@gmail.com")
                .populatePassword("123456")
                .pressLoginButton();
        Assertions.assertEquals("karamfilovs@gmail.com", app.homePage.getUserPanelText());
    }
}
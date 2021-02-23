package smoke;

import base.TestSetup;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class LoginPageTest extends TestSetup {


    @Test
    public void canLoginWithValidCredentials(){
        LoginPage loginPage = new LoginPage(page);
        loginPage
                .populateUsername("karamfilovs@gmail.com")
                .populatePassword("123456")
                .pressLoginButton();
    }
}

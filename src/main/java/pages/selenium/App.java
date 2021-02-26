package pages.selenium;

import org.openqa.selenium.WebDriver;

public class App {
    private WebDriver driver;
    public LoginPage loginPage;
    public HomePage homePage;

    public App(WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }



}

package pages.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.playwright.IPage;


public class BasePage implements IPage {
    protected WebDriver driver;

    BasePage(WebDriver driver){
        this.driver = driver;
    }


    @Override
    public void click(String locator) {

        driver.findElement(By.cssSelector(locator)).click();

    }

    @Override
    public void typeText(String locator, String text) {
        WebElement element = driver.findElement(By.cssSelector(locator));
        element.clear();
        element.sendKeys(text);
    }

    @Override
    public void navigateTo(String url) {
        driver.navigate().to(url);
    }

    @Override
    public String getText(String locator) {
        return driver.findElement(By.cssSelector(locator)).getText().trim();
    }
}

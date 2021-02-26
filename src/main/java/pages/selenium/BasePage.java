package pages.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.playwright.IPage;


public class BasePage implements IPage {
    protected WebDriver driver;

    BasePage(WebDriver driver) {
        this.driver = driver;
    }


    @Override
    public void click(String selector) {
        waitForVisibilityOf(selector);
        driver.findElement(By.cssSelector(selector)).click();

    }

    @Override
    public void typeText(String selector, String text) {
        waitForVisibilityOf(selector);
        WebElement element = driver.findElement(By.cssSelector(selector));
        element.clear();
        element.sendKeys(text);
    }

    @Override
    public void navigateTo(String url) {
        driver.navigate().to(url);
    }

    @Override
    public void waitForVisibilityOf(String selector) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(selector)));
    }

    @Override
    public String getText(String selector) {
        waitForVisibilityOf(selector);
        return driver.findElement(By.cssSelector(selector)).getText().trim();
    }
}

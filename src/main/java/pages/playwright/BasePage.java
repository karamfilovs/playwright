package pages.playwright;

import com.microsoft.playwright.Page;

public class BasePage implements IPage {
    protected Page page;

    public BasePage(Page page) {
        this.page = page;
    }

    @Override
    public void click(String selector) {
        waitForVisibilityOf(selector);
        page.click(selector);

    }

    @Override
    public void typeText(String selector, String text) {
        waitForVisibilityOf(selector);
        page.fill(selector, text);

    }

    @Override
    public void navigateTo(String url) {
        page.navigate(url);
    }

    @Override
    public void waitForVisibilityOf(String selector) {
        page.waitForSelector(selector);
    }

    @Override
    public String getText(String selector) {
        return page.textContent(selector);
    }



}

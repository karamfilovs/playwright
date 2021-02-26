package pages.playwright;

import com.microsoft.playwright.Page;

public  class BasePage implements IPage {
    protected Page page;

    public BasePage(Page page){
        this.page = page;
    }

    @Override
    public void click(String locator) {
        page.click(locator);

    }

    @Override
    public void typeText(String locator, String text) {
        page.fill(locator, text);

    }

    @Override
    public void navigateTo(String url) {
        page.navigate(url);
    }

    @Override
    public String getText(String locator) {
        return page.textContent(locator);
    }


}

package pages.playwright;

public interface IPage {
    static final String URL = null;
    static final String TITLE = null;

    void click (String locator);
    void typeText(String text, String locator);
    void navigateTo(String url);
    String getText(String locator);

}


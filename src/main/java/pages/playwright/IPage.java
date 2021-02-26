package pages.playwright;

public interface IPage {
    static final String URL = "";
    static final String TITLE = "";

    void click (String selector);
    void typeText(String text, String selector);
    void navigateTo(String url);
    void waitForVisibilityOf(String selector);
    String getText(String selector);

}


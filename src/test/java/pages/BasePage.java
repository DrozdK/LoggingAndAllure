package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {

    protected static WebDriver driver;

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }

    public static void open(String url) {
        driver.get(url);
    }
}

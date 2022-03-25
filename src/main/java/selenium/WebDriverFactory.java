package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import tasks.ConfigObjectProvider;

public class WebDriverFactory {
    public WebDriver webDriver;
    ConfigObjectProvider cfg = new ConfigObjectProvider();

    public void initialize(String typeOfBrowser, String version) {

        if (typeOfBrowser.equals("Chrome")) {
            webDriver = Chrome.getWebDriver(version);
            webDriver.manage().window().setSize(new Dimension(cfg.getBrowserWidth(), cfg.getBrowserHeight()));
            System.out.println("WebDriver set up");
        }
        if (typeOfBrowser.equals("Firefox")) {
            webDriver = Firefox.getWebDriver(version);
            System.out.println("WebDriver set up");
        }
        if (webDriver == null)
            System.out.println("WebDriver not set up");
    }

    public WebDriver getDriver() {
        return webDriver;
    }

    public void end() {
        webDriver.quit();
        System.out.println("WebDriver is unset");
    }
}

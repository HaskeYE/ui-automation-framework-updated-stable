package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Chrome {
    public static WebDriver getWebDriver(String version) {
        DesiredCapabilities caps = new DesiredCapabilities();
        WebDriverManager.chromedriver().driverVersion(version).setup();
        System.out.println("Chrome driver successfully set up");
        return new ChromeDriver();
    }
}

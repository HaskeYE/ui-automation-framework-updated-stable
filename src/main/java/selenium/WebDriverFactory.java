package selenium;

import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
    private WebDriver webDriver;

    public WebDriverFactory() {

    }

     public void initialize(String typeOfBrowser, String version) {

         if (typeOfBrowser.equals("Chrome")) {
             this.webDriver = Chrome.getWebDriver(version);
             System.out.println("WebDriver set up");
         }
         if (typeOfBrowser.equals("Firefox")) {
             this.webDriver = Firefox.getWebDriver(version);
             System.out.println("WebDriver set up");
         }
         if (this.webDriver == null)
         System.out.println("WebDriver not set up");
     }


     public WebDriver get() {
         return this.webDriver;
     }

     public void end() {
         webDriver.quit();
         System.out.println("WebDriver is unset");
     }
}

package tasks;

import configInterfaces.RunConfiguration;
import configInterfaces.Environment;
import org.aeonbits.owner.ConfigFactory;

public class ConfigObjectProvider {
    String browser;
    String browserWidth;
    String browserHeight;
    String seleniumVer;
    String homepageURL;
    int timeout;

    public ConfigObjectProvider() {
        RunConfiguration cfgRun = ConfigFactory.create(RunConfiguration.class);
        Environment cfgEnv = ConfigFactory.create(Environment.class);
        this.browser = cfgRun.browser();
        this.browserHeight = cfgRun.browserHeight();
        this.browserWidth = cfgRun.browserWidth();
        this.seleniumVer = cfgRun.seleniumVer();
        this.homepageURL = cfgEnv.homepageURL();

        this.timeout = cfgRun.timeout();
    }

    public String collectAllToString(){
        return ("Browser: " + browser + "\nbrowserWidth: " + browserWidth + "\nbrowserHeight: " + browserHeight +
                "\nseleniumVer: " + seleniumVer + "\nhomepageURL: " + homepageURL + "\ntimeout: " + timeout);
    }

    public int getTimeout() {
        return timeout;
    }

    public String getBrowser() {
        return browser;
    }

    public String getSeleniumVer() {
        return seleniumVer;
    }

    public String getHomepageURL() {
        return homepageURL;
    }
}

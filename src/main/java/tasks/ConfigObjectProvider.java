package tasks;

import configInterfaces.RunConfiguration;
import configInterfaces.Environment;
import org.aeonbits.owner.ConfigFactory;

public class ConfigObjectProvider {
    String browser;
    int browserWidth;
    int browserHeight;
    String seleniumVer;
    String homepageURL;
    int timeout;
    String myPassword;
    String myEmail;

    public ConfigObjectProvider() {
        RunConfiguration cfgRun = ConfigFactory.create(RunConfiguration.class);
        Environment cfgEnv = ConfigFactory.create(Environment.class);
        this.browser = cfgRun.browser();
        this.browserHeight = cfgRun.browserHeight();
        this.browserWidth = cfgRun.browserWidth();
        this.seleniumVer = cfgRun.seleniumVer();
        this.homepageURL = cfgEnv.homepageURL();
        this.myEmail = cfgRun.email();
        this.myPassword = cfgRun.password();


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

    public int getBrowserHeight() {
        return browserHeight;
    }

    public int getBrowserWidth() {
        return browserWidth;
    }

    public String getSeleniumVer() {
        return seleniumVer;
    }

    public String getHomepageURL() {
        return homepageURL;
    }

    public String getMyEmail() {
        return myEmail;
    }

    public String getMyPassword() {
        return myPassword;
    }
}

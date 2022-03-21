package configInterfaces;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.*;

@Sources({"file:src/main/resources/RunConfiguration.properties"})
public interface RunConfiguration extends Config {
    @Key("browser.name")
    @DefaultValue("Chrome")
    String browser();

    @Key("browser.width")
    String browserWidth();

    @Key("browser.height")
    String browserHeight();

    @Key("selenium.version")
    String seleniumVer();

    @Key("timeout.settings")
    int timeout();
}

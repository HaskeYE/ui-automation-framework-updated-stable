package configInterfaces;

import org.aeonbits.owner.Config;

@Config.Sources({"file:src/main/resources/Environment.properties"})
public interface Environment extends Config {
    @Key("homepage.url")
    String homepageURL();
}

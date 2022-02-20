package aafanasyevaa.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/env.properties"
})
public interface ProjectConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://reqres.in/")
    String baseUrl();

    @DefaultValue("chrome")
    String browser();

    @DefaultValue("91.0")
    String browserVersion();

    @DefaultValue("1920x1080")
    String browserSize();

    @Key("remoteUrl")
    @DefaultValue("")
    String remoteUrl();

    @Key("videoStorage")
    @DefaultValue("")
    String videoStorage();

    @Key("login")
    String login();

    @Key("password")
    String password();
}

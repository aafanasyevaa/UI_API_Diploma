package aafanasyevaa.ui;

import aafanasyevaa.helpers.Attach;
import aafanasyevaa.helpers.DriverSettings;
import aafanasyevaa.ui.pages.ReqresIn;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.junit5.AllureJunit5;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;

import static aafanasyevaa.helpers.DriverSettings.config;

@ExtendWith({AllureJunit5.class})
public class TestBase {

    public ReqresIn reqresIn = new ReqresIn();

    @BeforeAll
    static void setup() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        DriverSettings.configure();
    }

    @AfterEach
    public void tearDown() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        Selenide.closeWebDriver();
    }
}

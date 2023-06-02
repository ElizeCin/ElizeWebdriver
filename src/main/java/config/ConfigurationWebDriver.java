package config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static config.Baseclass.driver;
import static config.WebDriversEnum.CHROME;
import static config.WebDriversEnum.CHROME_INCOGNITO;
import static org.openqa.selenium.remote.Browser.FIREFOX;

public class ConfigurationWebDriver {
    static public WebDriver createDriver(WebDriversEnum webDrivers) {
        switch (webDrivers) {
            case CHROME -> createChrome();
            case CHROME_INCOGNITO -> createChromeIncognito();
        }
        return driver;
    }
    private static void createChromeIncognito() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    private static void createChrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }
}
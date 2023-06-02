package config;

import org.openqa.selenium.WebDriver;

public class Baseclass {
     static public WebDriver driver = ConfigurationWebDriver.createDriver(WebDriversEnum.CHROME);
}

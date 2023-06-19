package config;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class Baseclass {
     public static WebDriver driver;

     @BeforeClass
     public static void BeforeParent() {
          driver = ConfigurationWebDriver.createDriver(WebDriversEnum.CHROME_INCOGNITO);
     }

     @AfterClass
     public static void afterParent() {
          try {
               Thread.sleep(3000);
          } catch (InterruptedException e) {
               e.printStackTrace();
          }
          driver.quit();
     }
}


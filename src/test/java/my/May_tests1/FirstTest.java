package my.May_tests1;

import config.Baseclass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import java.util.Set;

public class FirstTest extends Baseclass {
    static String mainUrl = "https://dnipro.ithillel.ua/";
    By consultationButton = By.id("btn-consultation-hero");
    By agreement = By.xpath("//*[@id=\"form-consultation\"]//footer//a[@target=\"_blank\"]");

    @BeforeClass
    public static void beFirstTest() {
        driver.get(mainUrl);
    }
    @Before
    public void beforeM() {
        if(!driver.getCurrentUrl().equals(mainUrl)) {
            driver.navigate().to(mainUrl);
        }
    }
    @Test
    public void test1() {
        driver.findElement(consultationButton).click();
        String win = driver.getWindowHandle();
        String name = driver.getTitle();
        driver.findElement(agreement).click();
        sleep(2000);
        driver.switchTo().window(win);
//        driver.switchTo().window(name);
        sleep(3000);

        Set<String> stringSet = driver.getWindowHandles();
        for (String s : stringSet) {
            driver.switchTo().window(s);
            if (driver.getTitle().contains("Hillel")) {
                break;
            }
        }
    }

    @Test
    public void test2() {
        driver.findElement(consultationButton).click();
        Assert.assertTrue(driver.findElement(By.id("form-consultation")).isEnabled());
    }

    private void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


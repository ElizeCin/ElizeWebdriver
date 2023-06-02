package config;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

public class FirstTest extends Baseclass {

    private final By consultationButton = By.id("btn-consultation-hero");

    @BeforeClass
    public static void beFirstTest() {
        driver.get("https://dnipro.ithillel.ua/");
    }

    @Test
    public void test1() {
        driver.findElement(consultationButton).click();
    }

    @Test
    public void test2() {
        driver.findElement(consultationButton).click();
//        Assert.
    }
}


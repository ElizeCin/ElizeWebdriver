package my.May_tests1;

import config.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestHillel extends Baseclass {
    public static void main(String[] args) {
        driver.get("https://dnipro.ithillel.ua/");
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());
        WebElement consultButton = driver.findElement(By.id("btn-consultation-hero"));
        System.out.println(consultButton.getText());
        consultButton.click();
        WebElement programming = driver.findElement(By.xpath("//*[@id=\"body\"]/div[1]/main/section[2]/div/div/div[1]/div/ul/li[1]/a"));
        programming.click();
        System.out.println(driver.findElement(By.className("section-content_descriptor")).getText());

        System.out.println(driver.getPageSource());
        driver.manage().window();
        System.out.println(driver.findElement(By.id("btn-consultation-hero")).getText());
//        WebElement consultButton = driver.findElement(By.id("btn-consultation-hero"));
        System.out.println(driver.findElement(By.className("section-content_description")).getText());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}

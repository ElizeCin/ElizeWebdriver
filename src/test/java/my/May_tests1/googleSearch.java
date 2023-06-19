package my.May_tests1;
import config.Baseclass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MainPageObject;

import java.time.Duration;

public class googleSearch extends Baseclass {
    private static MainPageObject mainPage;

    @Test
    public void cheeseTest() {
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();
        driver.findElement(By.name("q")).sendKeys("cheese");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
        System.out.println(firstResult.getText());

    }
}

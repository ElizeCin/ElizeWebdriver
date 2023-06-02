import config.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GoogleTest extends Baseclass {
    public static void main(String[] args) {
        driver.get("https://www.google.com");
        WebElement cookiesButton = driver.findElement(By.id("L2AGLb"));
        cookiesButton.click();
        driver.findElement(By.id("APjFqb")).sendKeys("Ukraine");
        driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
//        WebElement chooseButton = driver.findElement(By.className("gNO89b"));
//        chooseButton.click();


    }
}

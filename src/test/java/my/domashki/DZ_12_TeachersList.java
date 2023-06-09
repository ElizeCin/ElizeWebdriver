package my.domashki;
import Util.util;
import config.Baseclass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class DZ_12_TeachersList extends Baseclass {
    static String mainLink = "https://dnipro.ithillel.ua/";
    By coursesOpen = By.xpath("//*[@id=\"body\"]/div[1]/div[1]/div[2]/div/div/nav/ul/li[2]/button");
    By programuvannya = By.xpath("//*[@id=\"coursesMenuControlPanel\"]/ul/li[2]/button");
    By frontEndBasic = By.xpath("//*[@id=\"block-202987\"]/div/ul/li[1]/a");
    By listOfTeachers = By.xpath("//li[@class=\"coach-list_item\"]");


    @Test
    public void showTeachersList() {
        driver.get(mainLink);
        driver.findElement(coursesOpen).click();
        driver.findElement(programuvannya).click();
        driver.findElement(frontEndBasic).click();

        util.scrollToElementVisibilityOf(driver, By.className("coach-card_name"));

        List<WebElement> wList = driver.findElements(listOfTeachers);
        System.out.println("Course Front-End Basic: list of teachers: \n");
        for (WebElement element : wList) {
            System.out.println(element.findElement(By.className("coach-card_name")).getText());
        }
    }
}
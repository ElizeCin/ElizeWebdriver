package my.domashki;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;
import Util.util;

public class DZ_13_PageObject {
    private static WebDriver driver;
    By courseTitle = By.className("course-descriptor_header");
    By courseRate = By.cssSelector("#body > div.site-wrapper > main > section.section.-hero.-offline\\' > div.section-content > div > div > div.course-descriptor_rating > div > span");
    By courseDescription = By.className("introduction-info_title");
    static By coachesShowAll = By.id("coachesShowAllButton");
    static By coachListItem = By.className("coach-list_item");
    static By coachCardName = By.className("coach-card_name");

    public DZ_13_PageObject (WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getCourseTitle() {
        return driver.findElement(courseTitle);
    }

    public WebElement getCourseRate() {
        return driver.findElement(courseRate);
    }

    public WebElement getCourseDescription() {
        return driver.findElement(courseDescription);
    }

    public static List<String> getCoachesNames() {
        util.scrollToElementVisibilityOf(driver, coachesShowAll);
        driver.findElement(coachesShowAll).click();
        List<String> nameList = new ArrayList<>();
        for (WebElement element : driver.findElements(coachListItem)) {
            nameList.add(element.findElement(coachCardName).getText());
        }
        return nameList;
    }
}


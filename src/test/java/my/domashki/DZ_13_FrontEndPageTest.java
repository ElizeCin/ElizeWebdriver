package my.domashki;
import config.Baseclass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Arrays;

public class DZ_13_FrontEndPageTest extends Baseclass {
    private static DZ_13_PageObject frontEndPage;

    @BeforeClass
    public static void beforeTest() {
        driver.get("https://ithillel.ua/courses/front-end-basic");
        frontEndPage = new DZ_13_PageObject(driver);
    }

    @Test
    public void test1() throws InterruptedException {
        System.out.println(frontEndPage.getCourseTitle().getText());
    }

    @Test
    public void test2() throws InterruptedException {
        System.out.println(frontEndPage.getCourseRate().getText());
    }

    @Test
    public void test3() throws InterruptedException {
        System.out.println(frontEndPage.getCourseDescription().getText());
    }

    @Test
    public void test4() {
        System.out.println(DZ_13_PageObject.getCoachesNames());
    }
}

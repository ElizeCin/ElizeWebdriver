package my.June_6_Factory;

import config.Baseclass;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.MainPageObject;

public class TestMainPage extends Baseclass {
    private static MainPageObject mainPage;
    @BeforeClass
    public static void beforetest() {
        driver.get("https://ithillel.ua/");
        mainPage = new MainPageObject(driver);
    }

    @Test
    public void test1() {
        System.out.println(mainPage.getConsultationButton());
    }
}

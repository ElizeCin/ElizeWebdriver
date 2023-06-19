package my.June_6_Factory;
import config.Baseclass;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.MainPageObject;

public class TestMainPageFunction extends Baseclass {
    private static MainPageObject mainPage;
    private static String mainUrl = "https://ithillel.ua/";
    private static String contactUrl = "https://ithillel.ua/contact";
    @BeforeClass
    public static void beforetest() {
        driver.get("https://ithillel.ua/");
        mainPage = new MainPageObject(driver);
    }
        @After
    public void afTest(){
        if (!driver.getCurrentUrl().equals(mainUrl)) {
            driver.navigate().to(mainUrl);
        }
    }
    @Test
    public void test1() throws Exception {
        mainPage.getConsultationButton().click();
        assertFalse(mainPage.isEnabledFormConsultation());
        }

    @Test
    public void test2()  {
        mainPage.getContactsButton().click();
        assertEquals(contactUrl, driver.getCurrentUrl());
    }
    @Test
    public void test3() {
        mainPage.getSkolaButton().click();
        System.out.println(driver.getCurrentUrl());
    }
}

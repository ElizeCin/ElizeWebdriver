package my.June_6_Factory;
import Magic.hillelURL;
import config.Baseclass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.*;

public class TestContactsPage extends Baseclass {
    private static MainPageFactory contactsPage;

    @BeforeClass
    public static void beforetest() {
        driver.get(hillelURL.CONTACTS_URL);
        contactsPage = PageFactory.initElements(driver, MainPageFactory.class);
    }

    @Test
    public void test1() {
        assertTrue(contactsPage.isEnabledFormConsultation());
    }

//    @Test
//    public void test2() {
//        for (String socialsLinks : contactsPage.getSocialsLinks()){
//            System.out.println("list.add(\""+socialsLinks+"\")");
//
//        }
//    }
}

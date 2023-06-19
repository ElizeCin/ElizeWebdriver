package my.domashki;

import config.Baseclass;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DZ_11_HillelContactFormFillIn extends Baseclass {

    @Before
    public void setUp() {
        System.out.println("beforeeverytest");
    }

    @BeforeClass
    public static void setUp2() {
        System.out.println("beforeclaas");
    }

    @Test
    public void formFillIn_JavascriptCourse_Messenger() {
        driver.get("https://dnipro.ithillel.ua/");
        WebElement consultationButton = driver.findElement(By.id("btn-consultation-hero"));
        consultationButton.click();
        driver.findElement(By.id("input-name-consultation")).sendKeys("Єлизавета Смирнова");
        driver.findElement(By.id("input-email-consultation")).sendKeys("elizesmyrnova@gmail.com");
        driver.findElement(By.id("input-tel-consultation")).sendKeys("957502769");
        driver.findElement(By.xpath("//button[@data-name='tg']")).click();
//        driver.findElement(By.xpath("//*[@id=\"field-messenger-consultation\"]/div/div/div/div[2]/button[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"field-messenger-consultation\"]/div/div/div/div[1]/div/div[2]/input")).sendKeys("+380957502769");
        driver.findElement(By.id("listbox-btn-input-course-consultation")).click();
        driver.findElement(By.xpath("//*[@id=\"container-input-course-consultation\"]/div/ul/li[4]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"listbox-btn-input-consultation-consultation-time\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"container-input-consultation-consultation-time\"]/div/ul/li[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"form-consultation\"]/div[1]/footer/div[1]/label/span")).click();
//        driver.findElement(By.xpath("//*[@id=\"form-consultation\"]/div[1]/footer/div[2]/button")).click();


//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        driver.quit();
    }

    @After
    public void after() {
        System.out.println("aftereverytest");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("afterclass");
    }
}

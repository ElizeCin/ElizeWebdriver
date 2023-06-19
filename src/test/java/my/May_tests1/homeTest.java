package my.May_tests1;
import org.junit.BeforeClass;
import org.junit.Test;

public class homeTest {

    @BeforeClass
    public static void startM() {
        System.out.println("Before class");
    }

    @Test
    public void hometest1() {
        System.out.println("Test method 1");
    }

    @Test
    public void hometest2() {
        System.out.println("Test method 2");
    }


}

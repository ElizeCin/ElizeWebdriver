package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class util {
    public static void scrollToElementVisibilityOf(WebDriver driver, By by) { // metod kot.skrollit do elementa
        JavascriptExecutor js = (JavascriptExecutor) driver;
        boolean bool = false;
        while (!bool) { // cycle proveryaet est li element, i skrollit  poka ne naidet etot element
            try {
                driver.findElement(by);
                bool = true;
//            } catch (Exception ignore) {
                js.executeScript("window.scrollBy(0,500)");
//                try {
//                    Thread.sleep(3000);
                } catch (Exception ignore) {
                    js.executeScript("window.scrollBy(0,500)");
                }
            }
        }
    }


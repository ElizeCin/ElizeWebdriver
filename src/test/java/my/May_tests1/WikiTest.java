package my.May_tests1;

import config.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WikiTest extends Baseclass {
    static By wikiLink = new By.ById("Welcome_to_Wikipedia"),
    listTabs = new By.ByXPath("//li[contains(@class,\"vector-tab-noicon\") and contains(@class,\"mw-list-item\")]");
    static String url = "https://en.wikipedia.org/wiki/Main_Page";

    public static void main(String[] args) throws InterruptedException {
        driver.get(url);

        WebElement w = driver.findElement(wikiLink);
        System.out.println("Link from href: " + w.findElement(By.tagName("a")).getAttribute("href"));
        System.out.println("Text from attribute title: " + w.findElement(By.tagName("a")).getAttribute("title"));
        System.out.println("Text from element: " + w.findElement(By.tagName("a")).getText());
        List<WebElement> wList = driver.findElements(listTabs);
        for (WebElement element : wList) {
            System.out.println(element.getText() + " ");
            System.out.println(element.findElement(By.tagName("a")).getAttribute("href"));
        }

        Thread.sleep(3000);
        driver.quit();
    }
}

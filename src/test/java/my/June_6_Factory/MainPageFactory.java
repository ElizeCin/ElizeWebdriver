package my.June_6_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class MainPageFactory {
    @FindBy(xpath = "//button[contains(@class,\"btn-consultation\") and contains(@class,\"contacts-item_btn\")]")
    WebElement consultationButton;
    @FindBy(id = "form-consultation")
    WebElement formConsultation;

    @FindBy(xpath =  "//li[@class=\"socials-list_item\"]")
    List<WebElement> socialsList;

    public boolean isEnabledFormConsultation() {
        return formConsultation.isEnabled();
    }

    public List<String> getSocialsLinks() {
        List<String> stringList = new ArrayList<>();
        for (WebElement element : socialsList) {
            element.findElement(By.tagName("a")).getAttribute("href");
        }
        return stringList;
    }

}

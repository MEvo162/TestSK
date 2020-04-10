package LinksPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeliveryLink {
    private WebDriver driver;

    public DeliveryLink(WebDriver driver) {
        this.driver = driver;
    }

    private By heading = By.xpath("//h1");

    public String getHeadingText() {
        return driver.findElement(heading).getText();
    }
}
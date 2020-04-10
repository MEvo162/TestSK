package LinksPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CityLink {
    private WebDriver driver;

    public CityLink(WebDriver driver) { this.driver = driver; }

    private By heading = By.id("Modal3-title");

    public String getHeadingText() {
        return driver.findElement(heading).getText();
    }
}

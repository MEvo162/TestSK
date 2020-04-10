package LinksPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainCabinetLinkInMore {
    private WebDriver driver;

    public MainCabinetLinkInMore(WebDriver driver) {
        this.driver = driver;
    }

    private By heading = By.id("Modal9-title");

    public String getHeadingText() {
        return driver.findElement(heading).getText();
    }
}

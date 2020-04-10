package LinksPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuLink {
    private WebDriver driver;

    public MenuLink(WebDriver driver) {
        this.driver = driver;
    }

    private By heading = By.xpath("//h1");

    public String getHeadingText() {
        return driver.findElement(heading).getText();
    }
}

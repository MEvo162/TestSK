package LinksPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BonusLink {
    private WebDriver driver;

    public BonusLink(WebDriver driver) {
        this.driver = driver;
    }

    private By heading = By.xpath("//h2[text() = 'Программа лояльности для любимых гостей']");

    public String getHeadingText() {
        return driver.findElement(heading).getText();
    }


}

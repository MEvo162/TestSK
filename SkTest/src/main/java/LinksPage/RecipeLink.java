package LinksPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecipeLink {
    private WebDriver driver;

    public RecipeLink(WebDriver driver) {
        this.driver = driver;
    }
    private By heading = By.xpath("//h2[text() = 'Как сделать ресторанный ужин из заготовок «Своей Компании»?']");

    public String getHeadingText() {
        return driver.findElement(heading).getText();
    }
}



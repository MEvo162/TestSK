package LinksPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReservationLink {
    WebDriver driver;

    public ReservationLink(WebDriver driver) {
        this.driver = driver;
    }

    public By Headreservatiok = By.xpath("//h1");
}

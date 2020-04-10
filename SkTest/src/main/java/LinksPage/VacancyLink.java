package LinksPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VacancyLink {
    WebDriver driver;

    public VacancyLink(WebDriver driver) {
        this.driver = driver;
    }

    public By headVacancy = By.xpath("//title");
}


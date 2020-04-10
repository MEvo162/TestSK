package MainpageLinksinHeadTest;

import LinksPage.*;
import MainPage.MainPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MainpageLinksinHeadTest {

    private WebDriver driver;
    private MainPage mainPage;
    private Actions actions;
    private VacancyLink vacancyLink;



    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "E:\\PageObject\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://svoya-kompaniya.ru");
        mainPage = new MainPage(driver);

        this.actions = new Actions(driver);
    }




    @Test
    public void GetHeadCityLink() {                                                      //проверка активности кнопки смены города
        CityLink cityLink = mainPage.cityLinkClick();
        String headingMenu = cityLink.getHeadingText();
        Assert.assertEquals("Ваш город", headingMenu);

    }

    @Test
    public void CheckHeadchangeCity() {                                                 //смена города из меню городов
        mainPage.cityLinkClick();
        driver.findElement(By.xpath("//span[text()='Москва']//..//..")).click();
        driver.findElement(mainPage.mycitybutton).click();
        String headMoscow = driver.findElement(mainPage.moscowtexthead).getText();
        Assert.assertEquals("Москва" , headMoscow);

    }

    @Test                                                                               //Смена города из дропдауна
    public void  ChangeCityDropMenu() {
        WebElement cityLink = driver.findElement(mainPage.cityLink);
        Actions actions = new Actions(driver);
        actions.moveToElement(cityLink).build().perform();
        driver.findElement(By.xpath("//div[@class='location']//li/a[text()='Москва']")).click();
        String headMoscow = driver.findElement(mainPage.moscowtexthead).getText();
        Assert.assertEquals("Москва" , headMoscow);

    }

    @Test
    public void GetHeadMenu(){                                                         //проверка работоспособности ссылки Меню и правильный переход
        MenuLink menuLink = mainPage.menulinkClick();
        String headingmenu = menuLink.getHeadingText();
        Assert.assertEquals("Меню", headingmenu);
    }

    @Test
    public void GetHeadDelivery() {                                                    //проверка работоспособности ссылки "Доставка и оплата" и правильный переход
        DeliveryLink deliveryLink = mainPage.deliveryLinkClick();
        String headingDelivery = deliveryLink.getHeadingText();
        Assert.assertEquals("Доставка и оплата", headingDelivery);

    }

    @Test
    public void GetHeadRestorans() {                                                         //проверка работоспособности ссылки Меню и правильный переход
        RestoransLink restoransLink = mainPage.restoransLinkClick();
        String headingRestorans = restoransLink.getHeadingText();
        Assert.assertEquals("Рестораны", headingRestorans);
    }

    @Test
    public void GetHeadRecipe() {                                                         //проверка работоспособности ссылки Рецепты и правильный переход
        RecipeLink recipeLink = mainPage.recipeLinkLinkClick();
        String headingRecipe = recipeLink.getHeadingText();
        Assert.assertEquals("Как сделать ресторанный ужин из заготовок «Своей Компании»?", headingRecipe);
    }

    @Test
    public void GetHeadBonus() {                                                         //проверка работоспособности ссылки Бонусы и правильный переход
        BonusLink bonusLink = mainPage.bonusLinkClick();
        String headingBonus = bonusLink.getHeadingText();
        Assert.assertEquals("Программа лояльности для любимых гостей", headingBonus);
    }

    @Test                                                                               // Переход в лк неавторизованным юзером через дроп меню
    public void  LkDropMenu() {
        WebElement mainmenu = driver.findElement(mainPage.topMenuMoreLink);

        actions.moveToElement(mainmenu).build().perform();
        driver.findElement(mainPage.mainCabinetLinkInMore).click();
        String titlemodal = driver.findElement(mainPage.heademodalLK).getText();
        Assert.assertEquals("Вход на сайт" , titlemodal);

    }

    @Test
    public void FranchiseDropMenu() {
        WebElement mainmenu = driver.findElement(mainPage.topMenuMoreLink);
        actions.moveToElement(mainmenu).build().perform();
        driver.findElement(mainPage.franchise).click();
        for (String tab : driver.getWindowHandles()){
            driver.switchTo().window(tab);
        }

        String headFranchise = driver.findElement(By.xpath("//p[text()='Преимущества франшизы «Своя компания»:']")).getText();
        Assert.assertEquals("Преимущества франшизы «Своя компания»:" , headFranchise);

    }

    @Test
    public void VacanyDropMenu(){
        WebElement mainmenu = driver.findElement(mainPage.topMenuMoreLink);
        actions.moveToElement(mainmenu).build().perform();
        driver.findElement(mainPage.vacancy).click();
        for (String tab : driver.getWindowHandles()){
            driver.switchTo().window(tab);
        }
        driver.findElement(By.xpath("//div[@class='popup popup-city-confirm']/div[1]")).click();
        String headVacancy = driver.findElement(By.xpath("//div[text()='Начни свой путь в Своей Компании']")).getText();
        Assert.assertEquals("Начни свой путь в Своей Компании" , headVacancy );
    }

    @Test
    public void bookingDropmenu() {
        WebElement mainmenu = driver.findElement(mainPage.topMenuMoreLink);
        actions.moveToElement(mainmenu).build().perform();
        driver.findElement(mainPage.reservationLink).click();
        String headReservation = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals("Бронирование" , headReservation);

    }


    @Test
    public void paymentDropmenu() {
        WebElement mainmenu = driver.findElement(mainPage.topMenuMoreLink);
        actions.moveToElement(mainmenu).build().perform();
        driver.findElement(mainPage.paymentInDropMenu).click();
        String headpaynent = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals("Процессинговый центр CloudPayments" , headpaynent);

    }


    @Test
    public void contactsDropmenu() {
        WebElement mainmenu = driver.findElement(mainPage.topMenuMoreLink);
        actions.moveToElement(mainmenu).build().perform();
        driver.findElement(mainPage.contactsInDropMenu).click();
        String headcontacts = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals("Контакты" , headcontacts);

    }


    @Test
    public void ReportsDropmenu() {
        WebElement mainmenu = driver.findElement(mainPage.topMenuMoreLink);
        actions.moveToElement(mainmenu).build().perform();
        driver.findElement(mainPage.reportsIndropmenu).click();
        String headreports= driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals("Отзывы" , headreports);

    }


    @Test
    public void PromoDropmenu() {
        WebElement mainmenu = driver.findElement(mainPage.topMenuMoreLink);
        actions.moveToElement(mainmenu).build().perform();
        driver.findElement(mainPage.promoInDropMenu).click();
        String headpromo= driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals("Акции" , headpromo);

    }

    @Test
    public void phonelink() {
        String phoneInheader = driver.findElement(mainPage.headerphone).getText();
        Assert.assertEquals("+7 (343) 298-00-44" , phoneInheader);
    }

    @Test
    public void ButtonSigin() {
        driver.findElement(mainPage.signInButton).click();
        String titlemodalSigin = driver.findElement(By.xpath("//div[@class='modal__title']")).getText();
        Assert.assertEquals("Вход на сайт", titlemodalSigin);
    }



    @After
    public void tearDown() {
        driver.quit();
    }

}
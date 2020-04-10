package MainPageTest;

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

public class MainpageLinksinFooter {

    private WebDriver driver;
    private MainPage mainPage;
    private Actions actions;


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
    public void GetFootMenu(){                                                         //проверка работоспособности ссылки Меню и правильный переход
        MenuLink menuLink = mainPage.menuLinkFootClick();
        String headingmenu = menuLink.getHeadingText();
        Assert.assertEquals("Меню", headingmenu);
    }

    @Test
    public void GetFootDelivery() {                                                    //проверка работоспособности ссылки "Доставка и оплата" и правильный переход
        DeliveryLink deliveryLink = mainPage.DeliveryFootClick();
        String headingDelivery = deliveryLink.getHeadingText();
        Assert.assertEquals("Доставка и оплата", headingDelivery);

    }

    @Test
    public void GetFootRestorans() {                                                         //проверка работоспособности ссылки Меню и правильный переход
        RestoransLink restoransLink = mainPage.RestoransFootClick();
        String headingRestorans = restoransLink.getHeadingText();
        Assert.assertEquals("Рестораны", headingRestorans);
    }

    @Test
    public void GetFootRecipe() {                                                         //проверка работоспособности ссылки Рецепты и правильный переход
        RecipeLink recipeLink = mainPage.RecipeFootClick();
        String headingRecipe = recipeLink.getHeadingText();
        Assert.assertEquals("Как сделать ресторанный ужин из заготовок «Своей Компании»?", headingRecipe);
    }

    @Test
    public void GetFootBonus() {                                                         //проверка работоспособности ссылки Бонусы и правильный переход
        BonusLink bonusLink = mainPage.BonusLinkFootClick();
        String headingBonus = bonusLink.getHeadingText();
        Assert.assertEquals("Программа лояльности для любимых гостей", headingBonus);
    }

    @Test                                                                               // Переход в лк неавторизованным юзером через дроп меню
    public void  LkFoot() {
        MainCabinetLinkInMore mainCabinetLinkInMore = mainPage.LKLinkFootClick();
        String titlemodal = mainCabinetLinkInMore.getHeadingText();
        Assert.assertEquals("Вход на сайт" , titlemodal);

    }

    @Test
    public void FranchiseFoot() {
        mainPage.FranchiseFootClick();
        for (String tab : driver.getWindowHandles()){
            driver.switchTo().window(tab);
        }
        String headFranchise = driver.findElement(By.xpath("//p[text()='Преимущества франшизы «Своя компания»:']")).getText();
        Assert.assertEquals("Преимущества франшизы «Своя компания»:" , headFranchise);

    }

    @Test
    public void Vacanyfoot(){
        mainPage.VacancyLinkFootClick();
        for (String tab : driver.getWindowHandles()){
            driver.switchTo().window(tab);
        }
        driver.findElement(By.xpath("//div[@class='popup popup-city-confirm']/div[1]")).click();
        String headVacancy = driver.findElement(By.xpath("//div[text()='Начни свой путь в Своей Компании']")).getText();
        Assert.assertEquals("Начни свой путь в Своей Компании" , headVacancy );
    }

    @Test
    public void bookingFoot() {
        mainPage.ReservationLinkFootClick();
        String headReservation = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals("Бронирование" , headReservation);

    }


    @Test
    public void paymentFoot() {
        mainPage.PaymentLinkFootClick();
        String headpaynent = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals("Процессинговый центр CloudPayments" , headpaynent);

    }


    @Test
    public void contactsFoot() {
        mainPage.ContactsLinkFootClick();
        String headcontacts = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals("Контакты" , headcontacts);

    }


    @Test
    public void ReportsFoot() {
        mainPage.ReportsLinkFootClick();
        String headreports= driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals("Отзывы" , headreports);

    }


    @Test
    public void PromoFoot() {
        mainPage.PromoLinkFootClick();
        String headpromo= driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals("Акции" , headpromo);

    }


    @Test
    public void Appstore(){
        mainPage.AppstoreClick();
        for (String tab : driver.getWindowHandles()){
            driver.switchTo().window(tab);
        }
        String heading = driver.findElement(By.xpath("//div/span[@class='we-localnav__title__qualifier']")).getText();
        Assert.assertEquals("Предпросмотр в", heading);
    }

    @Test
    public void PlayMarket(){
        mainPage.PlayMarketClick();
        for (String tab : driver.getWindowHandles()){
            driver.switchTo().window(tab);
        }
        String heading = driver.findElement(By.xpath("//a[@title='Google Play Logo']")).getAttribute("title");
        Assert.assertEquals("Google Play Logo", heading);
        String Sk = driver.findElement(By.xpath("//h1/span")).getText();
        Assert.assertEquals("Своя Компания", Sk);
    }


    @Test
    public void PhoneInFooter(){
        String PhoneInFooter = driver.findElement(By.xpath("//footer//span[text()='+7 (343) 298-00-44']")).getText();
        Assert.assertEquals("+7 (343) 298-00-44" , PhoneInFooter);
    }

    @Test
    public void DeliveryInFoot(){
        DeliveryLink deliveryLink = mainPage.DeliveryInFotClick();
        String headingDelivery = deliveryLink.getHeadingText();
        Assert.assertEquals("Доставка и оплата", headingDelivery);
    }


    @Test
    public void SKUpLink(){
        mainPage.ButtonSkUpClick();
        String head = driver.findElement(By.id("Modal5-title")).getText();
        Assert.assertEquals("Написать отзыв" , head);
    }




    @After
    public void tearDown() {
        driver.quit();
    }


}

package MainPage;

import LinksPage.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }


//      Top Header
    private By logo = By.xpath("//div[@class='logo']");                             //logo
    public By cityLink = By.xpath("//div[@class='location']");                     //City link
    private By menuLink = By.xpath("//div//a[text()='Меню']");                   // Main menu link
    private By deliveryLink = By.xpath("//div//a[text()='Доставка']");           //Delivery link
    public By reservationLink = By.xpath("//div//a[text()='Бронирование']");        //Reservation link
    private By restoransLink = By.xpath("//div//a[text()='Рестораны']");             // restorans link
    public By topMenuMoreLink = By.xpath("//div[@class='header-top__menu']//span[text()='Еще']"); // More links in header
    public By mainCabinetLinkInMore = By.xpath("//div[@class='clipper']//a[text()='Личный кабинет']");  //cabinet user in more
    public  By franchise = By.xpath("//div[@class='clipper']//a[text()='Франшиза']");       // franchise in more
    public By vacancy = By.xpath("//div[@class='clipper']//a[text()='Вакансии']");         //vacancy link in more
    public By headerphone = By.xpath("//div[@class='header-phone']");
    public By signInButton = By.xpath("//div//span[text()='Вход']");
    private By cartButton = By.xpath("//div[@class='header__basket']");
    //private By recipesLink = By.xpath("//li[@class='header-menu__item']//a[@href='/kak-prigotovit-blyuda-iz-zagotovok']");
    public By mycitybutton = By.xpath("//span[text()='ЭТО МОЙ ГОРОД']");
    public By moscowtexthead = By.xpath("//span[text()='Москва']");
    public By recipeLink = By.xpath("//header//div//a[text()='Рецепты']");
    public By bonusLink = By.xpath("//header//div//a[text()='Бонусы']");
    public By heademodalLK = By.xpath("//div[text()='Вход на сайт']");
    public By paymentInDropMenu = By.xpath("//header//li/a[text()='CloudPayments']");
    public By contactsInDropMenu = By.xpath("//header//div//a[text()='Контакты']");
    public By reportsIndropmenu = By.xpath("//header//div//a[text()='Отзывы']");
    public By promoInDropMenu = By.xpath("//header//div//a[text()='Акции']");
    // Header

    private By postmenuLink = By.xpath("//a[text()='Постное меню']");
    private By vegmenuLink = By.xpath("//a[text()='Veg']");
    private By rollmenuLink = By.xpath("//a[text()='Роллы']");
    private By setsLink = By.xpath("//a[text()='Сеты']");
    private By hotmenuLink = By.xpath("//a[text()='Горячее']");
    private By soupsLink = By.xpath("//a[text()='Супы']");
    private By pizzaLink = By.xpath("//a[text()='Пицца']");
    private By zakuskiLink = By.xpath("//a[text()='Закуски']");
    private By desertsLink = By.xpath("//a[text()='Десерты']");
    private By bredsLink = By.xpath("//a[text()='Хлеб']");
    private By kidsMenuLink = By.xpath("//a[text()='Детское меню']");
    private By banketMenuLink = By.xpath("//a[text()='Банкетное меню']");
    private By moreLinkiheader = By.xpath("//div[@class='header-bottom']//span[text()='Еще']");
    private By drinksLink = By.xpath("//a[text()='Напитки']");
    private By head = By.xpath("//h1");
    private By zagotovkiLinks = By.xpath("//a[text()='Заготовки']");


    //footer

    public By MenuFoot = By.xpath("//footer//li/a[text()='Меню']");
    public By DeliveryFoot = By.xpath("//footer//li/a[text()='Доставка']");
    public By RestoransFoot = By.xpath("//footer//li/a[text()='Рестораны']");
    public By RecipesFoot = By.xpath("//footer//li/a[text()='Рецепты']");
    public By BonusFoot = By.xpath("//footer//li/a[text()='Бонусы']");
    public By LKFoot = By.xpath("//footer//li/a[text()='Личный кабинет']");
    public By FranchiseFoot = By.xpath("//footer//li/a[text()='Франшиза']");
    public By VacancyFoot = By.xpath("//footer//li/a[text()='Вакансии']");
    public By BookingFoot = By.xpath("//footer//li/a[text()='Бронирование']");
    public By PaymentFoot = By.xpath("//footer//li/a[text()='CloudPayments']");
    public By ContactsFoot = By.xpath("//footer//li/a[text()='Контакты']");
    public By ReportsFoot = By.xpath("//footer//li/a[text()='Отзывы']");
    public By PromoFoot = By.xpath("//footer//li/a[text()='Акции']");
    public By AppstoreLink = By.xpath("//a[@title='мобильное приложение для iOS']");
    public By PlayMarketLink = By.xpath("//a[@title='мобильное приложение для Android']");
    public By DeliveryFot = By.xpath("//a/span[text()='Условия доставки']");
    public By ButtonSkUp = By.xpath("//button[@class='btn btn--secondary']");





    //metods

    public DeliveryLink deliveryLinkClick() {                       //переход на страницу доставка
        driver.findElement(deliveryLink).click();
        return new DeliveryLink(driver);

    }

    public CityLink cityLinkClick(){
        driver.findElement(cityLink).click();
        return new CityLink(driver);
    }

    public FranchiseLink openMoreMenu() {
        driver.findElement(topMenuMoreLink).click();
        return new FranchiseLink(driver);
    }

   /* public MainPage  getHeadingTextCity() {
        driver.findElement(By.xpath("//span[text()='Москва']")).getText();
        return this;
    } */

    public MenuLink menulinkClick() {                       //переход на страницу Меню
        driver.findElement(menuLink).click();
        return new MenuLink(driver);

    }

    public RestoransLink restoransLinkClick() {                       //переход на страницу рестораны
        driver.findElement(restoransLink).click();
        return new RestoransLink(driver);

    }

    public RecipeLink recipeLinkLinkClick() {                       //переход на страницу Рецепты
        driver.findElement(recipeLink).click();
        return new RecipeLink(driver);
    }

    public BonusLink bonusLinkClick() {                       //переход на страницу Рецепты
        driver.findElement(bonusLink).click();
        return new BonusLink(driver);
    }

    //footer

    public MenuLink menuLinkFootClick(){
        driver.findElement(MenuFoot).click();
        return new MenuLink(driver);
    }

    public DeliveryLink DeliveryFootClick(){
        driver.findElement(DeliveryFoot).click();
        return new DeliveryLink(driver);
    }

    public RestoransLink RestoransFootClick(){
        driver.findElement(RestoransFoot).click();
        return new RestoransLink(driver);
    }

    public RecipeLink RecipeFootClick(){
        driver.findElement(RecipesFoot).click();
        return new RecipeLink(driver);
    }

    public BonusLink BonusLinkFootClick(){
        driver.findElement(BonusFoot).click();
        return new BonusLink(driver);
    }

    public MainCabinetLinkInMore LKLinkFootClick(){
        driver.findElement(LKFoot).click();
        return new MainCabinetLinkInMore(driver);
    }

    public FranchiseLink FranchiseFootClick(){
        driver.findElement(FranchiseFoot).click();
        return new FranchiseLink(driver);
    }

    public VacancyLink VacancyLinkFootClick(){
        driver.findElement(VacancyFoot).click();
        return new VacancyLink(driver);
    }

    public ReservationLink ReservationLinkFootClick(){
        driver.findElement(BookingFoot).click();
        return new ReservationLink(driver);
    }

    public PaymentLink PaymentLinkFootClick(){
        driver.findElement(PaymentFoot).click();
        return new PaymentLink(driver);
    }

    public ContactsLink ContactsLinkFootClick(){
        driver.findElement(ContactsFoot).click();
        return new ContactsLink(driver);
    }

    public ReportsLink ReportsLinkFootClick(){
        driver.findElement(ReportsFoot).click();
        return new ReportsLink(driver);
    }

    public PromoLink PromoLinkFootClick(){
        driver.findElement(PromoFoot).click();
        return new PromoLink(driver);
    }

    public MainPage AppstoreClick(){
        driver.findElement(AppstoreLink).click();
        return new MainPage(driver);
    }

    public MainPage PlayMarketClick(){
        driver.findElement(PlayMarketLink).click();
        return new MainPage(driver);
    }

    public DeliveryLink DeliveryInFotClick(){
        driver.findElement(DeliveryFot).click();
        return new DeliveryLink(driver);
    }

    public MainPage ButtonSkUpClick(){
        driver.findElement(ButtonSkUp).click();
        return new MainPage(driver);
    }










}


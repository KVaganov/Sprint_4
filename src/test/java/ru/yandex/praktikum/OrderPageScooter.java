package ru.yandex.praktikum;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import static org.hamcrest.CoreMatchers.is;
public class OrderPageScooter {
    private final WebDriver driver;

    //Текст заголовка страницы "Для кого самокат"
    public static final String textOrderHeader = "Для кого самокат";
    //Текст кнопки "Посмотреть статус"
    public static final String buttonStatusText = "Посмотреть статус";
    //Локатор кнопки "Посмотреть статус"
    private final By buttonStatus = By.xpath(".//button[text()='Посмотреть статус']");
    //Локатор заголовка "Для кого самокат"
    private final By orderHead = By.xpath(".//div[contains(@class, 'Order_Header') and text()='Для кого самокат']");
    //Локатор модального окна "Заказ оформлен"
    private final By orderFinal = By.xpath(".//div[contains(@class, 'Order_ModalHeader') and text()='Заказ оформлен']");
    // Локатор поля Имя
    private final By nameField = By.xpath(".//input[@placeholder='* Имя']");
    // Локатор поля Фамилия
    private final By surnameField = By.xpath(".//input[@placeholder='* Фамилия']");
    // Локатор поля Адрес: куда привезти заказ
    private final By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    // Локатор поля Станция метро
    private final By metroButton = By.xpath(".//input[@placeholder='* Станция метро']");
    // Локатор поля Телефон: на него позвонит курьер
    private final By phoneField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    // Локатор кнопки Далее
    private final By orderButtonNext = By.xpath(".//div[contains(@class, 'Order_NextButton')]/button[text()='Далее']");
    // Локатор поля Когда привезти самокат
    private final By dataPicker = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    // Локатор поля Срок Аренды
    private final By rentalPeriodField = By.xpath(".//div[@class='Dropdown-placeholder']");
    // Локатор поля Комментарий для курьера
    private final By commentRent = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    // Локатор кнопки Заказать
    private final By rentButtonOrder = By.xpath(".//div[contains(@class, 'Order_Buttons')]/button[text()='Заказать']");
    // Локатор кнопки Да
    private final By rentButtonOrderYes = By.xpath(".//button[text()='Да']");
    public OrderPageScooter(WebDriver driver) {
        this.driver = driver;
    }
    // Метод заполнения поля Имя
    public void setNameField(String name)
    {
        driver.findElement(nameField).sendKeys(name);
    }
    // Метод заполнения поля Фамилия
    public void setSurnameField(String surname) {
        driver.findElement(surnameField).sendKeys(surname);
    }
    // Метод заполнения поля Адрес
    public void setAddressField(String address) {
        driver.findElement(addressField).sendKeys(address);
    }
    // Метод заполнения поля Станция метро
    public void clickMetroButton(String metro) {
        driver.findElement(metroButton).click();
        driver.findElement(metroButton).sendKeys(metro);
        driver.findElement(metroButton).sendKeys(Keys.DOWN, Keys.ENTER);
    }
    // Метод заполнения поля Телефон
    public void setPhoneField(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
    }
    // Метод нажатия кнопки Далее
    public void clickOrderButtonNext() {
        driver.findElement(orderButtonNext).click();
    }
    // Метод заполнения поля Комментарий для курьера
    public void setCommentRent(String comment)
    {
        driver.findElement(commentRent).sendKeys(comment);
    }
    // Метод выбора цвета самоката
    public void clickColour(String colour) {
        driver.findElement(By.xpath(".//label[text()='"+colour+"']")).click();
    }
    // Метод нажатия кнопки Заказать
    public void clickRentButtonOrder() {
        driver.findElement(rentButtonOrder).click();
    }
    // Метод заполнения поля Срок аренды
    public void clickRentalPeriod(String rentalPeriod) {
        driver.findElement(rentalPeriodField).click();
        driver.findElement(By.xpath(".//div[text()='"+rentalPeriod+"']")).click();
    }
    // Метод заполнения поля Когда привезти самокат
    public void clickDataPicker(String date) {
        driver.findElement(dataPicker).sendKeys(date);
        driver.findElement(dataPicker).sendKeys(Keys.ENTER);
    }
    // Метод нажатия кнопки Да
    public void clickRentButtonOrderYes() {
        driver.findElement(rentButtonOrderYes).click();
    }
    // Метод получения текста "Для кого самокат"
    public String checkOrderHead() {
        return driver.findElement(orderHead).getText();
    }

    // Метод получения текста кнопки "Посмотреть заказ"
    public String getButtonStatus() {
        return driver.findElement(buttonStatus).getText();
    }
    // Проверка, что текст корректно отображается в заголовке/кнопке
    public void isCorrectOpenPage(String actualText, String expectedText){
        MatcherAssert.assertThat(actualText, is(expectedText));
    }
}




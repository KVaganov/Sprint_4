package ru.yandex.praktikum;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static ru.yandex.praktikum.OrderPageScooter.*;


@RunWith(Parameterized.class)
public class TestRentFull {
    private WebDriver driver;
    private final String name;
    private final String surname;
    private final String address;
    private final String metro;
    private final String phone;
    private final String comment;
    private final String date;
    private final String colour;
    private final String rentalPeriod;
    public TestRentFull(String name, String surname, String address, String metro, String phone, String date, String rentalPeriod, String colour, String comment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.metro = metro;
        this.phone = phone;
        this.date = date;
        this.rentalPeriod = rentalPeriod;
        this.colour = colour;
        this.comment = comment;
    }
    @Parameterized.Parameters
    public static Object[][] getInformationForRent() {
        return new Object[][]{
                {"Иван", "Иванов", "Москва, ул. Лермонтова, д 1", "Черкизовская", "+79997775533", "25.05.2025", "сутки", "чёрный жемчуг", "Хорошего дня!=)"},
                {"Петр", "Петров", "Москва, ул. Ломоносова, д 10", "Сокольники", "+79996664422", "27.07.2025", "двое суток", "серая безысходность", "Улыбнитесь, и так поди устали=)"},
        };
    }
    @Test
    public void rentFull() {
        // Создание драйвера для браузера FireFox
        driver = new FirefoxDriver();
        // Переход на страницу
        driver.get("https://qa-scooter.praktikum-services.ru/");

        HomePageScooter homePage = new HomePageScooter(driver);
        //Нажать кнопку Да все привыкли
        homePage.clickCoockiButton();
        //Нажать кнопку заказать в верхней части страницы
        homePage.clickOrderButtonHead();

        OrderPageScooter orderPage = new OrderPageScooter(driver);
        //Ввести имя
        orderPage.setNameField(name);
        //Ввести фамилию
        orderPage.setSurnameField(surname);
        //Ввести адрес
        orderPage.setAddressField(address);
        //Ввести станцию метро
        orderPage.clickMetroButton(metro);
        //Ввести телефон
        orderPage.setPhoneField(phone);
        //Нажать кнопку Далее
        orderPage.clickOrderButtonNext();

        //Ввести дату
        orderPage.clickDataPicker(date);
        //Выбрать срок аренды
        orderPage.clickRentalPeriod(rentalPeriod);
        //Ввести цвет самоката
        orderPage.clickColour(colour);
        //Ввести оставить комментарий курьеру
        orderPage.setCommentRent(comment);
        //Нажать кнопку Заказать
        orderPage.clickRentButtonOrder();
        //Нажать кнопку Да
        orderPage.clickRentButtonOrderYes();
        //Проверка, что открылось модальное окно Заказ оформлен и присутствует кнопка Посмотреть статус
        orderPage.isCorrectOpenPage(orderPage.getButtonStatus(), buttonStatusText);
    }
    // Закрытие браузера
    @After
    public void tearDown() {
        driver.quit();
    }
}




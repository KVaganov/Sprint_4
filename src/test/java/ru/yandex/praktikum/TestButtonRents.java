package ru.yandex.praktikum;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static ru.yandex.praktikum.OrderPageScooter.*;

public class TestButtonRents {
    private WebDriver driver;
    @Test
    public void testRentButtonHead() {
        // Создание драйвера для браузера Chrome
        driver = new ChromeDriver();
        // Переход на страницу
        driver.get("https://qa-scooter.praktikum-services.ru/");
        HomePageScooter homePage = new HomePageScooter(driver);
        //Нажать кнопку заказать в верхней части страницы
        homePage.clickOrderButtonHead();
        OrderPageScooter orderPage = new OrderPageScooter(driver);
        //Проверить текст заголовка, чтобы убедиться в открытии окна заполнения формы заказа и что кнопка сработала
        orderPage.isCorrectOpenPage(orderPage.checkOrderHead(), textOrderHeader);
    }

    @Test
    public void testRentButtonMiddle() {
        // Создание драйвера для браузера Chrome
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        HomePageScooter homePage = new HomePageScooter(driver);
        homePage.clickCoockiButton();
        //Нажать кнопку заказать в нижней части страницы
        homePage.clickOrderButtonMiddle();
        OrderPageScooter orderPage = new OrderPageScooter(driver);
        //Проверить текст заголовка, чтобы убедиться в открытии окна заполнения формы заказа и что кнока сработала
        orderPage.isCorrectOpenPage(orderPage.checkOrderHead(), textOrderHeader);
    }
    // Закрытие браузера
    @After
    public void tearDown() {
        driver.quit();
    }
}




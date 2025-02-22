package ru.yandex.praktikum;


import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static ru.yandex.praktikum.HomePageScooter.*;

public class QuestionAndAnswer {

        private WebDriver driver;
        @Test
        public void testQuestionAndAnswer() {
            // Создание драйвера для браузера Firefox
            driver = new FirefoxDriver();
            // Переход на страницу
            driver.get("https://qa-scooter.praktikum-services.ru/");
            HomePageScooter homePage = new HomePageScooter(driver);
            // Скролл вниз до последнего вопроса
            homePage.scrollPageToEndOfList();
            //Кликнуть на вопрос 1 и получить ответ 1
            homePage.clickQuestionButton1();
                homePage.isCorrectAnswer(homePage.getAnswer1(), Answer1);
            //Кликнуть на вопрос 2 и получить ответ 2
            homePage.clickQuestionButton2();
                homePage.isCorrectAnswer(homePage.getAnswer2(), Answer2);
            //Кликнуть на вопрос 3 и получить ответ 3
            homePage.clickQuestionButton3();
                homePage.isCorrectAnswer(homePage.getAnswer3(), Answer3);
            //Кликнуть на вопрос 4 и получить ответ 4
            homePage.clickQuestionButton4();
                homePage.isCorrectAnswer(homePage.getAnswer4(), Answer4);
            //Кликнуть на вопрос 5 и получить ответ 5
            homePage.clickQuestionButton5();
                homePage.isCorrectAnswer(homePage.getAnswer5(), Answer5);
            //Кликнуть на вопрос 6 и получить ответ 6
            homePage.clickQuestionButton6();
                homePage.isCorrectAnswer(homePage.getAnswer6(), Answer6);
            //Кликнуть на вопрос 7 и получить ответ 7
            homePage.clickQuestionButton7();
                homePage.isCorrectAnswer(homePage.getAnswer7(), Answer7);
            //Кликнуть на вопрос 8 и получить ответ 8
            homePage.clickQuestionButton8();
                homePage.isCorrectAnswer(homePage.getAnswer8(), Answer8);
        }
    /// Закрытие браузера
    @After
    public void tearDown() {
        driver.quit();
    }
}


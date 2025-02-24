package ru.yandex.praktikum;


import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static ru.yandex.praktikum.HomePageScooter.*;


@RunWith(Parameterized.class)
public class QuestionAndAnswer {
    private WebDriver driver;
    private final String headingIndex;
    private final String answerText;

    public QuestionAndAnswer(String headingIndex, String answerText) {
        this.headingIndex = headingIndex;
        this.answerText = answerText;
    }
    @Parameterized.Parameters
    public static Object[][] getInformationFAQ() {
        return new Object[][]{
                {Question1, Answer1},
                {Question2, Answer2},
                {Question3, Answer3},
                {Question4, Answer4},
                {Question5, Answer5},
                {Question6, Answer6},
                {Question7, Answer7},
                {Question8, Answer8},
        };
    }
    @Test
    public void testQuestionAndAnswer() {
        // Создание драйвера для браузера Firefox
        driver = new FirefoxDriver();
        // Переход на страницу
        driver.get("https://qa-scooter.praktikum-services.ru/");
        HomePageScooter homePage = new HomePageScooter(driver);
        // Скролл вниз до последнего вопроса
        homePage.scrollPageToEndOfList();
        //Кликнуть на вопрос, получить ответ и проверить текст ответа
        homePage.clickQuestionButton(headingIndex);
        homePage.isCorrectAnswer(homePage.getAnswer(headingIndex), answerText);
    }
    /// Закрытие браузера
    @After
    public void tearDown() {
        driver.quit();
    }
}




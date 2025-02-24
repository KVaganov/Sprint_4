package ru.yandex.praktikum;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.hamcrest.CoreMatchers.is;


public class HomePageScooter {
    private final WebDriver driver;

    //Локатор кнопка Заказать в верхней части страницы
    private final By orderButtonHead = By.xpath(".//div[contains(@class, 'Header_Nav')]/button[text()='Заказать']");
    //Локатор кнопка Заказать в нижней части страницы
    private final By orderButtonMiddle = By.xpath(".//div[contains(@class, 'Home_FinishButton')]/button[text()='Заказать']");
    //Локатор кнопки Да все привыкли (куки)
    private final By coockiButton = By.xpath(".//button[contains(@class, 'App_CookieButton') and text()='да все привыкли']");

    //Наименование вопроса без индекса
    private final static String question = "accordion__heading-";
    //Наименование ответа без индекса
    private final static String answer = "accordion__panel-";

    //Локатор таблицы вопрос-ответ
    private final By homeFAQ = By.xpath(".//div[contains(@class,  'Home_FAQ')]");

    //Текст ответа 1
    public static final String Answer1 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    //Текст ответа 2
    public static final String Answer2 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    //Текст ответа 3
    public static final String Answer3 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    //Текст ответа 4
    public static final String Answer4 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    //Текст ответа 5
    public static final String Answer5 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    //Текст ответа 6
    public static final String Answer6 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    //Текст ответа 7
    public static final String Answer7 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    //Текст ответа 8
    public static final String Answer8 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
    //id вопроса 1
    public static final String Question1 = "0";
    //id вопроса 2
    public static final String Question2 = "1";
    //id вопроса 3
    public static final String Question3 = "2";
    //id вопроса 4
    public static final String Question4 = "3";
    //id вопроса 5
    public static final String Question5 = "4";
    //id вопроса 6
    public static final String Question6 = "5";
    //id вопроса 7
    public static final String Question7 = "6";
    //id вопроса 8
    public static final String Question8 = "7";


    public HomePageScooter(WebDriver driver) {
        this.driver = driver;
    }
    //Метод нажатия на кнопку Да все привыкли
    public void clickCoockiButton() {
        driver.findElement(coockiButton).click();
    }
    //Метод проверки текста в ответе
    public void isCorrectAnswer(String answer, String text){
        MatcherAssert.assertThat(answer, is(text));
    }
    //Метод нажатия на кнопку вопроса
    public void clickQuestionButton(String index) {
        driver.findElement(By.id(question + index)).click();
    }

    //Метод получения текста ответа
    public String getAnswer(String index){
        return driver.findElement(By.id(answer + index)).getText();
    }

    //Метод нажатия на кнопку Заказ в верхней части страницы
    public void clickOrderButtonHead() {
        driver.findElement(orderButtonHead).click();
    }
    //Метод нажатия на кнопку Заказ в нижней части страницы
    public void clickOrderButtonMiddle() {
        driver.findElement(orderButtonMiddle).click();
    }
    //Метод скролла до последнего вопроса на странице
    public void scrollPageToEndOfList() {
        WebElement lastQuestionArrow = driver.findElement(homeFAQ);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", lastQuestionArrow);
    }

}


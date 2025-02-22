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

    //Локатор кнопки вопроса 1
    private final By question1 = By.xpath(".//div[@id = 'accordion__heading-0']");
    //Локатор кнопки вопроса 2
    private final By question2 = By.xpath(".//div[@id = 'accordion__heading-1']");
    //Локатор кнопки вопроса 3
    private final By question3 = By.xpath(".//div[@id = 'accordion__heading-2']");
    //Локатор кнопки вопроса 4
    private final By question4 = By.xpath(".//div[@id = 'accordion__heading-3']");
    //Локатор кнопки вопроса 5
    private final By question5 = By.xpath(".//div[@id = 'accordion__heading-4']");
    //Локатор кнопки вопроса 6
    private final By question6 = By.xpath(".//div[@id = 'accordion__heading-5']");
    //Локатор кнопки вопроса 7
    private final By question7 = By.xpath(".//div[@id = 'accordion__heading-6']");
    //Локатор кнопки вопроса 8
    private final By question8 = By.xpath(".//div[@id = 'accordion__heading-7']");
    //Локатор ответа 1
    private final By answer1 = By.xpath(".//div[@id = 'accordion__panel-0']");
    //Локатор ответа 2
    private final By answer2 = By.xpath(".//div[@id = 'accordion__panel-1']");
    //Локатор ответа 3
    private final By answer3 = By.xpath(".//div[@id = 'accordion__panel-2']");
    //Локатор ответа 4
    private final By answer4 = By.xpath(".//div[@id = 'accordion__panel-3']");
    //Локатор ответа 5
    private final By answer5 = By.xpath(".//div[@id = 'accordion__panel-4']");
    //Локатор ответа 6
    private final By answer6 = By.xpath(".//div[@id = 'accordion__panel-5']");
    //Локатор ответа 7
    private final By answer7 = By.xpath(".//div[@id = 'accordion__panel-6']");
    //Локатор ответа 8
    private final By answer8 = By.xpath(".//div[@id = 'accordion__panel-7']");

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
    //Метод нажатия на кнопку вопроса 1
    public void clickQuestionButton1() {
        driver.findElement(question1).click();
    }
    //Метод нажатия на кнопку вопроса 2
    public void clickQuestionButton2() {
        driver.findElement(question2).click();
    }
    //Метод нажатия на кнопку вопроса 3
    public void clickQuestionButton3()  {
        driver.findElement(question3).click();
    }
    //Метод нажатия на кнопку вопроса 4
    public void clickQuestionButton4() {
        driver.findElement(question4).click();
    }
    //Метод нажатия на кнопку вопроса 5
    public void clickQuestionButton5() {
        driver.findElement(question5).click();
    }
    //Метод нажатия на кнопку вопроса 6
    public void clickQuestionButton6() {
        driver.findElement(question6).click();
    }
    //Метод нажатия на кнопку вопроса 7
    public void clickQuestionButton7() {
        driver.findElement(question7).click();
    }
    //Метод нажатия на кнопку вопроса 8
    public void clickQuestionButton8() {
        driver.findElement(question8).click();
    }

    //Метод получения текста ответа 1
    public String getAnswer1(){
        return driver.findElement(answer1).getText();
    }
    //Метод получения текста ответа 2
    public String getAnswer2(){
        return driver.findElement(answer2).getText();
    }
    //Метод получения текста ответа 3
    public String getAnswer3(){
        return driver.findElement(answer3).getText();
    }
    //Метод получения текста ответа 4
    public String getAnswer4(){
        return driver.findElement(answer4).getText();
    }
    //Метод получения текста ответа 5
    public String getAnswer5(){
        return driver.findElement(answer5).getText();
    }
    //Метод получения текста ответа 6
    public String getAnswer6(){
        return driver.findElement(answer6).getText();
    }
    //Метод получения текста ответа 7
    public String getAnswer7(){
        return driver.findElement(answer7).getText();
    }
    //Метод получения текста ответа 8
    public String getAnswer8(){
        return driver.findElement(answer8).getText();
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
        WebElement lastQuestionArrow = driver.findElement(question8);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", lastQuestionArrow);
    }

}

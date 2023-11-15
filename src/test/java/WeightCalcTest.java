import by.itacademy.bakumenko.CalcPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeightCalcTest {
    @Test
    public void testFormWithEmptyValues() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");
        CalcPage calcPage = new CalcPage();
        By enterButtonBy = By.xpath(calcPage.enterButtonLocator);
        WebElement enterButtonWebElement = driver.findElement(enterButtonBy);
        enterButtonWebElement.click();
        By ButtonResultBy = By.xpath(calcPage.enterButtonResult);
        WebElement buttonGetResultElement = driver.findElement(ButtonResultBy);
        String actual = buttonGetResultElement.getText();
        String expected = ("Не указано имя.\nРост должен быть в диапазоне 50-300 см." +
                "\nВес должен быть в диапазоне 3-500 кг." +
                "\nНе указан пол.");
        Assertions.assertEquals(expected, actual);
        driver.close();
    }
}

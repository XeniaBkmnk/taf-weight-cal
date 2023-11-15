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
        String enterButtonLocator = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input";
        By enterButtonBy = By.xpath(enterButtonLocator);
        WebElement enterButtonWebElement = driver.findElement(enterButtonBy);
        enterButtonWebElement.click();
        String enterButtonResult = "/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[1]/td/b";
        By ButtonResultBy = By.xpath(enterButtonResult);
        WebElement buttonGetResultElement = driver.findElement(ButtonResultBy);
        String actual = buttonGetResultElement.getText();
        String expected = ("Не указано имя.\nРост должен быть в диапазоне 50-300 см." +
                "\nВес должен быть в диапазоне 3-500 кг." +
                "\nНе указан пол.");
        Assertions.assertEquals(expected, actual);
        driver.close();
    }
}

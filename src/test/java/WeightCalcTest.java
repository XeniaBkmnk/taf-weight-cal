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
        WebElement enterButtonWebElement = driver.findElement( By.xpath(calcPage.enterButtonLocator));
        enterButtonWebElement.click();
        WebElement buttonGetResultElement = driver.findElement(By.xpath(calcPage.enterButtonResult));
        Assertions.assertEquals 
            ( 
                "Не указано имя.\nРост должен быть в диапазоне 50-300 см." +
                "\nВес должен быть в диапазоне 3-500 кг." +
                "\nНе указан пол.",  buttonGetResultElement.getText()
         );
        driver.close();
    }
}

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HirokuGetText {
    @Test
    public void Test()  {
        WebDriverManager.chromedriver().browserVersion("4.0.0-alpha-6").setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // with minimize test is failed
        driver.navigate().to("http://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/dynamic_loading']")).click();
        driver.findElement(By.xpath("//a[@href='/dynamic_loading/1']")).click();
        driver.findElement(By.xpath("//button")).click();
       WebDriverWait wait = new WebDriverWait(driver,20);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']")));
       String actual = driver.findElement(By.xpath("//h4[text()='Hello World!']")).getText();
        String expected = "Hello World!";
        Assert.assertEquals(actual,expected);
    }
}

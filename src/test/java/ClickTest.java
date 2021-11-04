import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClickTest {
    @Test
    public void Test2(){
        WebDriverManager.chromedriver().browserVersion("3.8.1").setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.tesla.com/");
        driver.findElement(By.xpath("//i[@aria-label='Toggle Side Menu']")).click();
        driver.findElement(By.xpath("//i[@aria-label='Toggle Side Menu']")).click();
        driver.findElement(By.xpath("//a[@href='/contact']")).click();
        driver.findElement(By.xpath("//a[@href='/findus/store']")).click();
        driver.findElement(By.xpath("//a[@href='/solarpanels']")).click();
       String actual= driver.findElement(By.xpath("//span[text()='Solar for Existing Roofs']")).getText();
       String expected = "Solar for Existing Roofs";
        Assert.assertEquals(actual,expected);
    }
}

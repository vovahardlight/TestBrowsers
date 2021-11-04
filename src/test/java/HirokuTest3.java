import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HirokuTest3 {
    @Test
    public void Test3() throws InterruptedException {
        WebDriverManager.chromedriver().browserVersion("4.0.0-alpha-6").setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[@href='/dynamic_controls']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//button[@onclick='swapInput()']")).click();
        Thread.sleep(20000);
        driver.findElement(By.xpath("//input[@type='text']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1");
        driver.findElement(By.xpath("//button[@onclick='swapInput()']")).click();
        Thread.sleep(20000);
        String actual= driver.findElement(By.xpath("//p[@id='message']")).getText();
       String expected= "It's disabled!";
        Assert.assertEquals(actual,expected);
        driver.quit();

    }
}

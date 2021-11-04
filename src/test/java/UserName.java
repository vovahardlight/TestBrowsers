import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserName {

    @Test
    public void Test()

    {
        WebDriverManager.chromedriver().browserVersion("3.8.1").setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://the-internet.herokuapp.com/login");
        driver.findElement(By.xpath("//input[@id='username']")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Vladimir");
        driver.findElement(By.xpath("//input[@id='password']")).click();
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("000000");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String actual = driver.findElement(By.xpath("//div[contains(text(),'Your username is invalid')]")).getText();
        String expected ="Your username is invalid!\n" +
                "×";
        Assert.assertEquals(actual,expected);
    }
}



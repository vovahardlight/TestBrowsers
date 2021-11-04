import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HirokuTest2 {
    @Test
    public void Test2(){
        WebDriverManager.chromedriver().browserVersion("3.8.1").setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://the-internet.herokuapp.com/disappearing_elements");
        driver.findElement(By.xpath("//a[@href='/']")).click();
       String actual= driver.findElement(By.xpath("//h1")).getText();
       String expected = "Welcome to the-internet";
        Assert.assertEquals(actual,expected);
    }
}

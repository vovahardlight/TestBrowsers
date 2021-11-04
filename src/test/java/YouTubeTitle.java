import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class YouTubeTitle {
    @Test
    public void Test1(){
        WebDriverManager.chromedriver().browserVersion("4.0.0-beta-2").setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.youtube.com/");
        driver.findElement(By.xpath("//ytd-topbar-logo-renderer[@id='logo']/child ::a[@id='logo']")).click();
        String expected = "YouTube";
String text = driver.getTitle();
        Assert.assertEquals(text,expected);
        driver.quit();
    }
}

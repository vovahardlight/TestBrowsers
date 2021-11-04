import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SurfingTest {
    @Test
    public void Test1() throws InterruptedException {
        WebDriverManager.chromedriver().browserVersion("4.0.0-alpha-6").setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://alfabank.ua/");
        driver.findElement(By.xpath("//header//button")).click();
        driver.findElement(By.xpath("//img[@src='/storage/editor/fotos/84b356655fd4a3886be671c5d4b6f90c_1563944807.svg']")).click();
        Thread.sleep(10000);
        String actual = driver.findElement(By.xpath("//h1[contains(text(),'Увійти в ОК, Альфа!')]")).getText();
        String expected = "Увійти в ОК, Альфа!";
        Assert.assertEquals(actual,expected);
        driver.quit();


    }
}

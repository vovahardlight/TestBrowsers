import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wiki {
    @Test
    public void Test5(){

        WebDriverManager.chromedriver().browserVersion("4.0.0-alpha-6").setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");
        WebElement image= driver.findElement(By.xpath("//img[@src='//upload.wikimedia.org/wikipedia/commons/thumb/0/03/Passerina_ciris-20090208.jpg/150px-Passerina_ciris-20090208.jpg']"));
        Assert.assertEquals("111px",image.getCssValue("height"));
    }
}

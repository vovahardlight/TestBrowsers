import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WikiFindAllTd {
    @Test
    public void Test1() {
        WebDriverManager.chromedriver().browserVersion("4.0.0-alpha-6").setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://ru.wikipedia.org/wiki/%D0%9E%D1%81%D0%BA%D0%B0%D1%80_(%D0%BA%D0%B8%D0%BD%D0%BE%D0%BF%D1%80%D0%B5%D0%BC%D0%B8%D1%8F,_2021)");
        List<WebElement> td = driver.findElements(By.xpath("//td"));
        Assert.assertEquals(156, td.size());
    }
}

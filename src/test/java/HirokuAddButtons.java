import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HirokuAddButtons {
    @Test
    public void Test(){
        WebDriverManager.chromedriver().browserVersion("3.8.1").setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://the-internet.herokuapp.com/add_remove_elements/");
driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
driver.findElement(By.xpath("//button[@onclick='deleteElement()']")).click();
for (int i=0;i<10;i++){
    driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
}
String actual = driver.findElement(By.xpath("//button[@onclick='deleteElement()']")).getText();
String expected = "Delete";
        Assert.assertEquals(expected,actual);
        driver.quit();
    }
}

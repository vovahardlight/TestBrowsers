package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class NasaTest {
    @Test
    public void Test(){
        WebDriverManager.chromedriver().browserVersion("3.14.0").setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.nasa.gov/");
List url = driver.findElements(By.xpath("//a"));
        Assert.assertEquals(98,url.size());
    }
}

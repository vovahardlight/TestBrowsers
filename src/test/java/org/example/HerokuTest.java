package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HerokuTest {
    @Test
    public void Test1() {
        WebDriverManager.chromedriver().browserVersion("4.0.0-alpha-6").setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.ted.com/");
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-ga-label='/membership']")));
        driver.findElement(By.xpath("//a[@data-ga-label='/membership']")).click();
        driver.navigate().back();

        WebElement image = driver.findElement(By.xpath("//div[@aria-label='illustration of person pointing at an calendar']"));

        Assert.assertEquals("300px",image.getCssValue("max-height"));

    }

}
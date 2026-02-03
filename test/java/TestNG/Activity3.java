package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/login-form");
    }

    @Test
    public void loginTest() {
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        Assert.assertEquals("Welcome Back, Admin!", driver.findElement(By.cssSelector("h2.text-center")).getText());
    }

    @AfterClass
    public void afterClass() {
        driver.close();
    }
}
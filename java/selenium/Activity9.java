package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);
        driver.get("https://training-support.net/webelements/keyboard-events");

        System.out.println("Title of the page:  " + driver.getTitle());
        builder.sendKeys("Hi from Selenium").sendKeys(Keys.RETURN).build().perform();

        String pageText = driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/h1/span")).getText();
        System.out.println(pageText);
    }
}

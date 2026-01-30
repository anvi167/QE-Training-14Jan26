package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class Activity8 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        Actions builder = new Actions(driver);

        driver.get("https://training-support.net/webelements/mouse-events");
        System.out.println("Page title is:  " + driver.getTitle());

        WebElement cargoLock = driver.findElement(By.xpath("//h1[@text() ='Cargo.Lock'"));
        WebElement cargoToml = driver.findElement(By.xpath("/h1[@text() = 'Cargo.toml'"));
        WebElement srcButton = driver.findElement(By.xpath("/h1[@text() = 'src'"));
        WebElement targetButton = driver.findElement(By.xpath("/h1[@text() = 'target'"));

        builder.click(cargoLock).pause(1000).moveToElement(cargoToml).pause(5000).click(cargoToml).build().perform();
        // Print the front side text
        String actionMessage = driver.findElement(By.id("result")).getText();
        System.out.println(actionMessage);

        // Perform double click on src
        // then right click on target
        builder.doubleClick(srcButton).pause(3000).pause(5000)
        .contextClick(targetButton).pause(3000).build().perform();
        // and then open it
        
        driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/div[2]/div/ul/li[1]/button"));
        builder.click().pause(5000).build().perform();
        // Print the front side text
        actionMessage = driver.findElement(By.id("result")).getText();
        System.out.println(actionMessage);
    }
}

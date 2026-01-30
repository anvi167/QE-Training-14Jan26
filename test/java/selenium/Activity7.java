// Activity 7
// Check if elements are enabled
// Using Selenium:

// Open a new browser to https://training-support.net/webelements/dynamic-controls
// Get the title of the page and print it to the console.
// On the page, perform:
// Find the text field.
// Check if the text field is enabled and print it.
// Click the "Enable Input" button to enable the input field.
// Check if the text field is enabled again and print it.
// Close the browser.

package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-controls"); 
        System.out.println("Page title is:  " + driver.getTitle());

        WebElement textbox = driver.findElement(By.id("textInput"));
        // Check if it is enabled
        System.out.println("Input field is enabled: " + textbox.isEnabled());
        // Click the toggle button to enable it
        driver.findElement(By.id("textInputButton")).click();
        // Check if the text field is enabled
        System.out.println("Input field is enabled: " + textbox.isEnabled());
        
        // Type something in to it
        textbox.sendKeys("Example text");
        System.out.println(textbox.getDomProperty("value"));
    }
}

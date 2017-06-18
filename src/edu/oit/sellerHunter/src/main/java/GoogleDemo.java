import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by wenduoguo on 6/15/17.
 */
public class GoogleDemo {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
// Alternatively the same thing can be done like this
// driver.navigate().to("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Cheese!");
        element.submit();


    }
}

package Day20;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        
        try {
            driver.manage().window().maximize();
            
            
            driver.get("https://www.amazon.com");
            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            
            WebElement searchBar = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.id("twotabsearchtextbox")));
           
            searchBar.sendKeys("offer letter");
            searchBar.sendKeys(Keys.ENTER);
            
            wait.until(
                ExpectedConditions.presenceOfElementLocated(By.cssSelector("span.data-component-type"))
            );
            
            System.out.println("Search results loaded successfully! Current Page Title: " + driver.getTitle());
            
            Thread.sleep(2000);
            
        } catch (Exception e) {
            System.out.println("An error occurred during test execution: " + e.getMessage());
        }
     }
}

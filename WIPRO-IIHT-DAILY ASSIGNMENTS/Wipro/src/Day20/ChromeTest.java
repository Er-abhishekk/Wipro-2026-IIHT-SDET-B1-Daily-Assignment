package Day20;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        
        try {
            driver.manage().window().maximize();
            driver.get("https://www.google.com");
            
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("youtube");
            searchBox.sendKeys(Keys.ENTER);
            
            System.out.println("Page Title: " + driver.getTitle());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}

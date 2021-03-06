import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
        public static WebDriver driver;
        public void openBrowser(String baseUrl){
            System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
            driver= new ChromeDriver();
            driver.get(baseUrl);
            //to maximize window
            driver.manage().window().maximize();
            // to apply implicity wait
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.manage().getCookies();
            //return the list of all cookies

        }
        public void closingBrowser(){
            driver.quit();

        }
    }


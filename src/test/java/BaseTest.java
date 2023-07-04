import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {

    @BeforeSuite
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }


        public static WebDriver driver = null;
        public static String url = "https://qa.koel.app/";


        @BeforeMethod
        @Parameters({"BaseURL"})
        public void launchBrowser(String BaseURL){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            url = BaseURL;
            driver.get(url);
        }
        @AfterMethod
        public void quitBrowser(){
            driver.quit();
        }

        @DataProvider (name="LoginProviders")
        public static Object[][] getLoginData(){
            return new Object[][]{
                    {"yana.kurenko@testpro.io", "te$t$tudent"}
            };
        }

        public void clickLoginButton() throws InterruptedException {
            WebElement logInButton = driver.findElement(By.cssSelector("button[type = 'submit']"));
            logInButton.click();
            Thread.sleep(2000);
        }

        public void enterPassword(String password) {
            WebElement passwordInput = driver.findElement(By.cssSelector("[type='password']"));
            passwordInput.click();
            passwordInput.clear();
            passwordInput.sendKeys(password);
        }

        public void enterEmail(String email) {
            WebElement emailInput = driver.findElement(By.cssSelector("[type='email']"));
            emailInput.click();
            emailInput.clear();
            emailInput.sendKeys(email);
//        }public static void openUrl() {
//            String url = "https://qa.koel.app/";
//            driver.get(url);
        }



}
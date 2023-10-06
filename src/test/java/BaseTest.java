import Pages.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URI;
import java.time.Duration;




public class BaseTest {
    public static WebDriver driver = null;
    public static WebDriverWait wait = null;
    public static Actions actions = null;
    public static String url = null;
    @BeforeSuite
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    public static WebDriver pickBrowser(String browserName) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        String gridURL = "http://192.168.12.9:4444";

        switch (browserName){
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                return driver = new FirefoxDriver();
            case "grid-firefox":
                caps.setCapability("browserName","firefox");
                return driver = new RemoteWebDriver(URI.create(gridURL).toURL(),caps);

            default:
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--remote-allow-origins");
                return driver = new ChromeDriver(chromeOptions);
        }


    }



    @BeforeMethod
    @Parameters({"BaseURL"})
    public void launchBrowser(String BaseURL){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();


        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        actions = new Actions(driver);
        url = BaseURL;
        driver.get(url);
    }
    @AfterMethod
    public void quitBrowser(){
        driver.quit();
    }


    @DataProvider (name = "LoginProviders")
    public static Object [][] getLoginData(){
        return new Object[][]{
                {"yana.kurenko@testpro.io", "te$t$tudent"}
        };

    }



    public static void enterEmail (String email){
        WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[type = 'email']")));
        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public static void enterPassword (String password){
        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[type = 'password']")));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public static void clickLoginButton (){
        WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[type = 'submit']")));
        loginButton.click();



    }


}
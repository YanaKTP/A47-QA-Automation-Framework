

import Pages.BasePage;

import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends BaseTest {
    @Test

//    public void LoginEmptyEmailPasswordTest() {
//
////      Added ChromeOptions argument below to fix websocket error
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//
//        WebDriver driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        String url = "https://qa.koel.app/";
//        driver.get(url);
//        Assert.assertEquals(driver.getCurrentUrl(), url);
//        driver.quit();
//    }

    public void loginValidPassword(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.login();

        Assert.assertTrue(homePage.getUserAvatar().isDisplayed());


    }
}

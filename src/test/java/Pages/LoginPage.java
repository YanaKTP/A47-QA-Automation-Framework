package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

<<<<<<< Updated upstream
public class LoginPage extends BasePage{
    public LoginPage(WebDriver givenDriver){
        super(givenDriver);
    }

=======
public class LoginPage extends BasePage {
    public LoginPage(WebDriver givenDriver){
        super(givenDriver);

    }
>>>>>>> Stashed changes
    By emailField = By.cssSelector("[type = 'email']");
    By passwordField = By.cssSelector("[type = 'password']");
    By submitBTN = By.cssSelector("button[type = 'submit']");

    public void provideEmail(String email){
        findElement(emailField).sendKeys(email);
<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
    }
    public void providePassword(String password){
        findElement(passwordField).sendKeys(password);
    }
    public void clickSubmit(){
        findElement(submitBTN).click();
    }

    public void login(){
        provideEmail("yana.kurenko@testpro.io");
        providePassword("te$t$tudent");
        clickSubmit();
    }
<<<<<<< Updated upstream
}

=======


}
>>>>>>> Stashed changes

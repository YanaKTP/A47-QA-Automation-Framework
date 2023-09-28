package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver givenDriver){
        super(givenDriver);
    }

    @FindBy(css = "[type='email']")
    WebElement emailField;
    @FindBy(css = "[type = 'password']")
    WebElement passwordField;
    @FindBy(css = "button[type = 'submit']")
    WebElement submitBTN;
//    By emailField = By.cssSelector("[type = 'email']");
//    By passwordField = By.cssSelector("[type = 'password']");
//    By submitBTN = By.cssSelector("button[type = 'submit']");

    public void provideEmail(String email){
        emailField.sendKeys(email);}

    public void providePassword(String password){
        passwordField.sendKeys(password);
    }
    public void clickSubmit(){
        submitBTN.click();
    }

    public void login(){
        provideEmail("yana.kurenko@testpro.io");
        providePassword("te$t$tudent");
        clickSubmit();

    }
}



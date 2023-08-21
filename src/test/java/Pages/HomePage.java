package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
<<<<<<< Updated upstream

    public HomePage(WebDriver givenDriver){
        super(givenDriver);
    }
=======
    public HomePage(WebDriver givenDriver){
        super(givenDriver);
    }

>>>>>>> Stashed changes
    By userAvatar = By.cssSelector("img.avatar");

    public WebElement getUserAvatar(){
        return findElement(userAvatar);
    }
}

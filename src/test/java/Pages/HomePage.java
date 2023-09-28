package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{


    public HomePage(WebDriver givenDriver){
        super(givenDriver);
    }

    @FindBy (css = "img.avatar")
            WebElement userAvatar;
    @FindBy (css ="li a.songs" )
            WebElement allSongs;

//    By userAvatar = By.cssSelector("img.avatar");
//    By allSongs = By.cssSelector("li a.songs");
    By playBtn = By.cssSelector("[data-testid='play-btn']");

    public WebElement getUserAvatar(){
        return userAvatar;
    }

    public void chooseAllSongsList(){
        allSongs.click();
    }

    public WebElement hoverPlay(){
        hoverAction(playBtn);
        return findElement(playBtn);



    }


}

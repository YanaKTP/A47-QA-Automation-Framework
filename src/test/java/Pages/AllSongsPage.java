package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllSongsPage extends BasePage{
    public AllSongsPage(WebDriver givenDriver){
        super(givenDriver);
    }

    By firstSong = By.cssSelector(".all-songs tr.song-item:nth-child(1)");
//    By playSong = By.cssSelector("li.playback");
//    By soundBar = By.xpath("//*[@id='mainFooter']/div[2]/div[2]/div/button[1]/div");
    @FindBy (css = "li.playback")
    WebElement playSong;
    @FindBy (xpath = "//*[@id='mainFooter']/div[2]/div[2]/div/button[1]/div")
    WebElement soundBar;
    public void contextClickFirstSong(){
        contextClick(firstSong);

    }
    public void choosePlayOption(){
        playSong.click();

    }

    public boolean isSongPlaying(){
        return soundBar.isDisplayed();


    }

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework17 extends BaseTest {
    @Test
    public void addSongToPlaylist () throws InterruptedException{

        String newSongAddedNotificationText = "Added 1 song into ";

    openUrl();
    enterEmail("yana.kurenko@testpro.io");
    enterPassword("te$t$tudent");
    clickLoginButton();
    clickSearchfield("Dark Days");
    viewAllButton();
    Thread.sleep(2000);
    clickOnFirstSong();
    clickOnAddToButton();
    clickOnPlaylist();


    Assert.assertTrue(lookForPopUpMessage().contains("newSongAddedNotificationText"));
    Thread.sleep(2000);



    }

    private void clickOnPlaylist() {
        WebElement choosePlaylist = driver.findElement(By.xpath("//*[@id='songResultsWrapper']/header/div[3]/div/section[1]/ul/li[5]"));
        choosePlaylist.click();
    }

    private void clickOnAddToButton() {
        WebElement addToButton = driver.findElement(By.cssSelector("[class='btn-add-to']"));
        addToButton.click();
    }

    private void clickOnFirstSong() {
        WebElement firstSong = driver.findElement(By.xpath("//*[@id=\"songResultsWrapper\"]/div/div/div[1]/table/tr[1]/td[2]"));
        firstSong.click();
    }

    private void viewAllButton() {
        WebElement AllButton = driver.findElement(By.cssSelector("button[data-test='view-all-songs-btn']"));
        AllButton.click();

    }

    private void clickSearchfield(String songName) {
        WebElement searchField = driver.findElement(By.cssSelector("input[type='search']"));
        searchField.click();
        searchField.clear();
        searchField.sendKeys(songName);
    }

    public String lookForPopUpMessage() {
        WebElement popUpMessage = driver.findElement(By.cssSelector("div.success.show"));
        return  popUpMessage.getText();
    }


}



//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class Homework21 extends BaseTest {
//
//    String newNameForPlayList = "New Name";
//
//    @Test(dataProvider = "LoginProviders", dataProviderClass = BaseTest.class)
//    public void renamePlaylist(String email, String password) {
//        enterEmail(email);
//        enterPassword(password);
//        clickLoginButton();
//        doubleClickOnPlaylist();
//        giveNewNameToPlaylist();
//        Assert.assertTrue(doesPlaylistExist());
//
//
//    }
//
//    private void giveNewNameToPlaylist() {
//        WebElement playlistNameField = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-testid = 'inline-playlist-name-input']")));
//        playlistNameField.sendKeys(Keys.chord(Keys.COMMAND,"A",Keys.BACK_SPACE));
//        playlistNameField.sendKeys(newNameForPlayList);
//        playlistNameField.sendKeys(Keys.ENTER);
//
//    }
//     public boolean doesPlaylistExist(){
//        WebElement playlistWithNewName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='" + newNameForPlayList +"']")));
//        return playlistWithNewName.isDisplayed();
//     }
//
//
//
//
//    private void doubleClickOnPlaylist() {
//        WebElement playlist = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='playlists']/ul/li[3]")));
//        actions.doubleClick(playlist).perform();
//
//    }
//}
//



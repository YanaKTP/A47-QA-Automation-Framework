import Pages.AllSongsPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SongTest extends BaseTest{
    @Test
    public void playSong(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        AllSongsPage allSongsPage = new AllSongsPage(driver);

        loginPage.login();

        homePage.chooseAllSongsList();
        allSongsPage.contextClickFirstSong();
        allSongsPage.choosePlayOption();

        Assert.assertTrue(allSongsPage.isSongPlaying());
    }

    @Test
    public void hoverOverPlayButton(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        AllSongsPage allSongsPage = new AllSongsPage(driver);

        loginPage.login();
        homePage.chooseAllSongsList();
        homePage.hoverPlay();
        Assert.assertTrue(homePage.hoverPlay().isDisplayed());
    }
}

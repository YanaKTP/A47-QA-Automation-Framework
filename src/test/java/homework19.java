import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class homework19 extends BaseTest{

    @Test (dataProvider = "LoginProviders")
    public void deletePlaylist (String email, String password) throws InterruptedException   {
//        openUrl();
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
        Thread.sleep(5000);

        clickOnPlaylist();
        Thread.sleep(2000);
        findDeleteButton();
        Thread.sleep(2000);
        successMessage();
        Thread.sleep(2000);

    }

    public String successMessage() {
        WebElement notificationMessage = driver.findElement(By.cssSelector("div.success.show"));
        return notificationMessage.getText();
    }

    private void findDeleteButton() {
        WebElement deleteButton = driver.findElement(By.cssSelector("[class='del btn-delete-playlist']"));
        deleteButton.click();
    }

    private void clickOnPlaylist() {
        WebElement playlist = driver.findElement(By.xpath("//*[@id='playlists']/ul/li[5]/a"));
        playlist.click();
    }
}


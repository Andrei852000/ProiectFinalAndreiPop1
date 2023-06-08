package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class WindowPopupModal extends BasePage{

    public WindowPopupModal(WebDriver driver){super(driver);}

    By FollowOnTwitter = By.xpath("/html/body/div[1]/section[3]/div/div/div/div[1]/a[1]");
    public void clickOnFollowOnTwitter(){driver.findElement(FollowOnTwitter).click();}

    By LikeusOnFacebook = By.xpath("/html/body/div[1]/section[3]/div/div/div/div[1]/a[2]");
    public void clickOnLikeusOnFacebook(){driver.findElement(LikeusOnFacebook).click();}

    By FollowTwitterAndFacebook = By.xpath("/html/body/div[1]/section[3]/div/div/div/div[2]/a[1]");
    public void clickOnFollowTwitterAndFacebook(){driver.findElement(FollowTwitterAndFacebook).click();}

    By FollowAll = By.xpath("/html/body/div[1]/section[3]/div/div/div/div[2]/a[2]");
    public void clickOnFollowAll(){driver.findElement(FollowAll).click();}
}

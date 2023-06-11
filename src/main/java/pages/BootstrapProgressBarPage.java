package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BootstrapProgressBarPage extends BasePage {

    public BootstrapProgressBarPage(WebDriver driver){super(driver);}

    By AutocloseAfter2Seconds = By.xpath("//*[@id=\"__next\"]/section[3]/div/div/div/button[1]");

    public void clickOnAutocloseAfter2Seconds(){ driver.findElement(AutocloseAfter2Seconds).click();}

    By AutocloseAfter3Seconds = By.xpath("//*[@id=\"__next\"]/section[3]/div/div/div/button[2]");

    public void clickOnAutocloseAfter3Seconds(){ driver.findElement(AutocloseAfter3Seconds).click();}

    By AutocloseAfter5Seconds = By.xpath("//*[@id=\"__next\"]/section[3]/div/div/div/button[3]");

    public void clickOnAutocloseAfter5Seconds(){ driver.findElement(AutocloseAfter5Seconds).click();}

    By BookADemo = By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div[1]/div/div[1]/a[1]");

    public void clickOnBookADemo(){ driver.findElement(BookADemo).click();}

    By CallUs = By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div[1]/div/div[1]/a[2]");

    public void clickOnCallUs(){ driver.findElement(CallUs).click();}

    By StartChatting = By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div[1]/div/div[1]/a[3]");

    public void clickOnStartChatting(){ driver.findElement(StartChatting).click();}

    By SendUsAnEmail = By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div[1]/div/div[1]/a[5]");

    public void clickOnSendUsAnEmail(){ driver.findElement(SendUsAnEmail).click();}
}

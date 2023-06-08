package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BootstrapAlerts extends BasePage{

    public BootstrapAlerts(WebDriver driver){super(driver);}

    By AutoclosableSuccessMessage = By.xpath("/html/body/div[1]/section[3]/div/div/div/div/div[1]/button[1]");
    public void clickOnAutoclosableSuccessMessage(){driver.findElement(AutoclosableSuccessMessage).click();}

    By NormalSuccessMessage = By.xpath("/html/body/div[1]/section[3]/div/div/div/div/div[1]/button[2]");
    public void clickOnNormalSuccessMessage(){driver.findElement(NormalSuccessMessage).click();}

    By AutoclosableInfoMessage = By.xpath("/html/body/div[1]/section[3]/div/div/div/div/div[1]/button[3]");
    public void clickOnAutoclosableInfoMessage(){driver.findElement(AutoclosableInfoMessage).click();}

    By NormalInfoMessage = By.xpath("/html/body/div[1]/section[3]/div/div/div/div/div[1]/button[4]");
    public void clickOnNormalInfoMessage(){driver.findElement(NormalInfoMessage).click();}

}

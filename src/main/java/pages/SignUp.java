package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp extends BasePage{

    public SignUp(WebDriver driver){super(driver);}

    By SignUpWithGoogle = By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[1]/a[1]/span");
    public void clickSignUpWithGoogle(){driver.findElement(SignUpWithGoogle).click();}

    By SignUpWithGithub = By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[1]/a[2]/span");
    public void clickSignUpWithGithub(){driver.findElement(SignUpWithGithub).click();}

    By FreeSignUp = By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[6]/button");
    public void clickFreeSignUp(){driver.findElement(FreeSignUp).click();}

    By SignIn = By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/p/a");
    public void clickSignIn(){driver.findElement(SignIn).click();}

    By TermsOfService  = By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[5]/div/a[1]");
    public void clickTermsOfService(){driver.findElement(TermsOfService).click();}

    By PrivacyPolicy  = By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[5]/div/a[2]");
    public void clickPrivacyPolicy(){driver.findElement(PrivacyPolicy).click();}

    By CookiePolicy  = By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[2]/form/div[5]/div/a[3]");
    public void clickCookiePolicy(){driver.findElement(CookiePolicy).click();}

}

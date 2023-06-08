package testCases;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.CheckboxDemo;
import pages.RadioButtonDemo;
import pages.SignUp;

public class SignUpTestCases extends BasePage {

    private SignUp signUp;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        signUp = new SignUp(driver);
    }

    @Test
    public void clickOnSignUpWithGoogle() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div/div[2]/div/div/div[2]/a[2]")).click();
        signUp.clickSignUpWithGoogle();
        Assert.assertEquals("Success - SignUp is Clicked", "Success - SignUp is Clicked");

    }

    @Test
    public void clickOnSignUpWithGithub() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div/div[2]/div/div/div[2]/a[2]")).click();
        signUp.clickSignUpWithGithub();
        Assert.assertEquals("Success - Github is Clicked", "Success - Github is Clicked");
    }

    @Test
    public void clickOnFreeSignUp() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div/div[2]/div/div/div[2]/a[2]")).click();
        signUp.clickFreeSignUp();
        Assert.assertEquals("Success - FreeSignUp is Clicked", "Success - FreeSignUp is Clicked");
    }

    @Test
    public void clickOnSignIn() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div/div[2]/div/div/div[2]/a[2]")).click();
        signUp.clickSignIn();
        Assert.assertEquals("Success - SignIn is Clicked", "Success - SignIn is Clicked");
    }

    @Test
    public void clickOnTermsOfService() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div/div[2]/div/div/div[2]/a[2]")).click();
        signUp.clickTermsOfService();
        Assert.assertEquals("Success - TermsOfService is Clicked", "Success - TermsOfService is Clicked");
    }

    @Test
    public void clickOnPrivacyPolicy() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div/div[2]/div/div/div[2]/a[2]")).click();
        signUp.clickPrivacyPolicy();
        Assert.assertEquals("Success - PrivacyPolicy is Clicked", "Success - PrivacyPolicy is Clicked");
    }

    @Test
    public void clickOnCookiePolicy() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/div/div[2]/div/div/div[2]/a[2]")).click();
        signUp.clickCookiePolicy();
        Assert.assertEquals("Success - CookiePolicy is Clicked", "Success - CookiePolicy is Clicked");
    }
}
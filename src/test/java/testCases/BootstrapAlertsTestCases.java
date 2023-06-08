package testCases;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.BootstrapAlerts;
import pages.RadioButtonDemo;

public class BootstrapAlertsTestCases extends BasePage{

    private BootstrapAlerts bootstrapAlerts;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        bootstrapAlerts = new BootstrapAlerts(driver);


    }

    @Test
    public void clickOnAutoclosableSuccessMessage() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[2]/div[1]/ul/li[1]/a")).click();
        bootstrapAlerts.clickOnAutoclosableSuccessMessage();
        Assert.assertEquals("AutoclosableSuccessMessage checked", "AutoclosableSuccessMessage checked");
    }

    @Test
    public void clickOnNormalSuccessMessage() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[2]/div[1]/ul/li[1]/a")).click();
        bootstrapAlerts.clickOnNormalSuccessMessage();
        Assert.assertEquals("NormalSuccessMessage checked", "NormalSuccessMessage checked");
    }

    @Test
    public void clickOnAutoclosableInfoMessage() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[2]/div[1]/ul/li[1]/a")).click();
        bootstrapAlerts.clickOnAutoclosableInfoMessage();
        Assert.assertEquals("AutoclosableInfoMessage checked", "AutoclosableInfoMessage checked");
    }

    @Test
    public void clickOnNormalInfoMessage() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[2]/div[1]/ul/li[1]/a")).click();
        bootstrapAlerts.clickOnNormalInfoMessage();
        Assert.assertEquals("NormalInfoMessage checked", "NormalInfoMessage checked");
    }

    }






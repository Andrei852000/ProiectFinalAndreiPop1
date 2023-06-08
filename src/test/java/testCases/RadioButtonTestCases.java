package testCases;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.RadioButtonDemo;


public class RadioButtonTestCases extends BasePage{

    private RadioButtonDemo radioButtonDemo;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        radioButtonDemo = new RadioButtonDemo(driver);
    }

    @Test
    public void clickOnMale() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnMale();
        Assert.assertEquals("Success - Male is checked", "Success - Male is checked");

   }

    @Test
    public void clickOnFemale() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnFemale();
        Assert.assertEquals("Success - Female is checked", "Success - Female is checked");

    }

    @Test
    public void clickOnAge0to5() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnAge0to5();
        Assert.assertEquals("Success - Female 0to5 checked", "Success - Female 0to5 checked");

    }

    @Test
    public void clickOnAge5to15() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnAge5to15();
        Assert.assertEquals("Success - Female 5to15 checked", "Success - Female 5to15 checked");

    }

    @Test
    public void clickOnAge15to50() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[3]/a")).click();
        radioButtonDemo.clickOnAge15to50();
        Assert.assertEquals("Success - Female 15to50 checked", "Success - Female 15to50 checked");

    }
}
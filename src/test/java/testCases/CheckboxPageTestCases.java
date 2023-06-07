package testCases;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.CheckboxDemo;
import pages.SimpleFormPage;


public class CheckboxPageTestCases extends BasePage{

    private CheckboxDemo checkboxDemo;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        checkboxDemo = new CheckboxDemo(driver);
    }

    @Test
    public void clickOnTheSingleCheckboxCheckMark() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[1]/a")).click();
        clickOnTheSingleCheckboxCheckMark();
        checkboxDemo.clickOnSingleCheckbox();
        Assert.assertEquals("Success - Check box is checked","Success - Check box is checked");
    }
}
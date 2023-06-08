package testCases;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.BootstrapAlerts;
import pages.WindowPopupModal;

public class WindowPopupModalTestCases extends BasePage {


        private WindowPopupModal windowPopupModal;

        @BeforeMethod
        public void setUp() {
            super.setUp();
            windowPopupModal = new WindowPopupModal(driver);

        }
    @Test
    public void clickOnFollowOnTwitter() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[2]/div[1]/ul/li[3]/a")).click();
        windowPopupModal.clickOnFollowOnTwitter();
        Assert.assertEquals("Twiter page is opened", "Twiter page is opened");
        }

    @Test
    public void clickOnLikeusOnFacebook() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[2]/div[1]/ul/li[3]/a")).click();
        windowPopupModal.clickOnLikeusOnFacebook();
        Assert.assertEquals("Twitter And Facebook are opened", "Twitter And Facebook are opened");
        }
    @Test
    public void clickOnFollowAll() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[2]/div[1]/ul/li[3]/a")).click();
        windowPopupModal.clickOnFollowAll();
        Assert.assertEquals("All pages are opened", "All pages are opened");
    }

    @Test
    public void clickOnFollowTwitterAndFacebook() throws InterruptedException {

        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[2]/div[1]/ul/li[3]/a")).click();
        windowPopupModal.clickOnFollowTwitterAndFacebook();
        Assert.assertEquals("Facebook page is opened", "Facebook page is opened");
    }

    }


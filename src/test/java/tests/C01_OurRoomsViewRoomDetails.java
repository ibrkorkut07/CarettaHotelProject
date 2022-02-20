package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_OurRoomsViewRoomDetails extends TestBase {

    @Test
    public void roomVerleneCarrollJrReviewdetails () throws InterruptedException {
        String homePageUrl = driver.getCurrentUrl();
        Actions actions = new Actions(driver);
        WebElement roomVerleneCarrollJrReviewdetailsButton = driver.findElement(By.xpath("(//p[@class='pt-1'])[1]"));
        actions.moveToElement(roomVerleneCarrollJrReviewdetailsButton).perform();
        Thread.sleep(1000);
        actions.click(roomVerleneCarrollJrReviewdetailsButton).perform();
        String roomVerleneCarrollJrPage = driver.getCurrentUrl();
        Assert.assertFalse(homePageUrl.contains(roomVerleneCarrollJrPage), "Review Details button could not lead to Verlene Carroll Jr. page");
    }

    @Test
    public void roomKyungBlockReviewdetails () throws InterruptedException {
        String homePageUrl = driver.getCurrentUrl();
        Actions actions = new Actions(driver);
        WebElement roomKyungBlockReviewdetailsButton = driver.findElement(By.xpath("(//p[@class='pt-1'])[2]"));
        actions.moveToElement(roomKyungBlockReviewdetailsButton).perform();
        Thread.sleep(1000);
        actions.click(roomKyungBlockReviewdetailsButton).perform();
        String roomKyungBlockPage = driver.getCurrentUrl();
        Assert.assertFalse(homePageUrl.contains(roomKyungBlockPage), "Review Details button could not lead to Kyung Block page");
        }

    @Test
    public void roomCorrieHesselReviewdetails () throws InterruptedException {
        String homePageUrl = driver.getCurrentUrl();
        Actions actions = new Actions(driver);
        WebElement roomCorrieHesselReviewdetailsButton = driver.findElement(By.xpath("(//p[@class='pt-1'])[3]"));
        actions.moveToElement(roomCorrieHesselReviewdetailsButton).perform();
        Thread.sleep(1000);
        actions.click(roomCorrieHesselReviewdetailsButton).perform();
        String roomCorrieHesselPage = driver.getCurrentUrl();
        Assert.assertFalse(homePageUrl.contains(roomCorrieHesselPage), "Review Details button could not lead to Corrie Hessel page");
        }

    @Test
    public void roomJarodBoganReviewdetails () throws InterruptedException {
        String homePageUrl = driver.getCurrentUrl();
        Actions actions = new Actions(driver);
        WebElement roomJarodBoganReviewdetailsButton = driver.findElement(By.xpath("(//p[@class='pt-1'])[4]"));
        actions.moveToElement(roomJarodBoganReviewdetailsButton).perform();
        Thread.sleep(1000);
        actions.click(roomJarodBoganReviewdetailsButton).perform();
        String roomJarodBoganPage = driver.getCurrentUrl();
        Assert.assertFalse(homePageUrl.contains(roomJarodBoganPage), "Review Details button could not lead to Jarod Bogan page");
        }

    @Test
       public void roomMsLucienLehnerReviewdetails () throws InterruptedException {
        String homePageUrl = driver.getCurrentUrl();
        Actions actions = new Actions(driver);
        WebElement roomMsLucienLehnerReviewdetailsButton = driver.findElement(By.xpath("(//p[@class='pt-1'])[5]"));
        actions.moveToElement(roomMsLucienLehnerReviewdetailsButton).perform();
        Thread.sleep(1000);
        actions.click(roomMsLucienLehnerReviewdetailsButton).perform();
        String roomMsLucienLehnerPage = driver.getCurrentUrl();
        Assert.assertFalse(homePageUrl.contains(roomMsLucienLehnerPage), "Review Details button could not lead to Ms. Lucien Lehner page");
    }

    @Test
    public void roomMsAbelConsidineReviewdetails () throws InterruptedException {
        String homePageUrl = driver.getCurrentUrl();
        Actions actions = new Actions(driver);
        WebElement roomMsAbelConsidineReviewdetailsButton = driver.findElement(By.xpath("(//p[@class='pt-1'])[6]"));
        actions.moveToElement(roomMsAbelConsidineReviewdetailsButton).perform();
        Thread.sleep(1000);
        actions.click(roomMsAbelConsidineReviewdetailsButton).perform();
        String roomMsAbelConsidinePage = driver.getCurrentUrl();
        Assert.assertFalse(homePageUrl.contains(roomMsAbelConsidinePage), "Review Details button could not lead to Ms. Abel Considine page");
    }
}
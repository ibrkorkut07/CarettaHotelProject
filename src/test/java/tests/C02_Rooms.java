package tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class C02_Rooms extends TestBase {

    @Test
    public void roomsPage () {
        WebElement roomsButton = driver.findElement(By.xpath("(//a[text()='Rooms'])[1]"));
        Assert.assertTrue(roomsButton.isEnabled());
        roomsButton.click();
        String actualRoomsUrl = driver.getCurrentUrl();
        String expectedRoomsUrl = "https://www.hotelmycamp.com/rooms";
        Assert.assertEquals(actualRoomsUrl, expectedRoomsUrl);
    }

    @Test
    public void roomsPageScreenshot () throws IOException {
        TakesScreenshot tss=(TakesScreenshot) driver;
        File roomPageScreenshot = new File("target/screenShot/roomPageSS.png");
        File temporaryScreenshotFile = tss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(temporaryScreenshotFile,roomPageScreenshot);
    }
}

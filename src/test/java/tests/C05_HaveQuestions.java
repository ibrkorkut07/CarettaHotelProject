package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C05_HaveQuestions extends TestBase {

    @Test
    public void questionsDisplayed () {
        WebElement questionsTextElement = driver.findElement(By.xpath("//h2[text()='Have Questions?']"));
        Assert.assertTrue(questionsTextElement.isDisplayed());
    }
    @Test
    public void phoneIconButtonEnabled () {
        WebElement phoneNumberButtonElement =driver.findElement(By.xpath("//span[@class='icon icon-phone']"));
        Assert.assertTrue(phoneNumberButtonElement.isEnabled());
    }

    @Test
    public void phoneNumberButtonnabled () {
        WebElement phoneNumberButtonElement =driver.findElement(By.xpath("//span[text()='302 718 2180']"));
        Assert.assertTrue(phoneNumberButtonElement.isEnabled());
    }

    @Test
    public void emailIconEnabled () {
        WebElement emailIconButtonElement =driver.findElement(By.xpath("//span[@class='icon icon-envelope']"));
        Assert.assertTrue(emailIconButtonElement.isEnabled());
    }

    @Test
    public void emailAddressInabled () {
        WebElement emailAddressButtonElement =driver.findElement(By.xpath("//span[text()='info@hotelmycamp.com']"));
        Assert.assertTrue(emailAddressButtonElement.isEnabled());
    }
}
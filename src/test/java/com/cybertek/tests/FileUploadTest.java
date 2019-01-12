package com.cybertek.tests;

import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.PublicKey;

public class FileUploadTest extends TestBase {

    @Test
    public void test() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement chooseFile = driver.findElement(By.id("file-upload"));


        String path = "/Users/ramile/Downloads/test.txt";

        chooseFile.sendKeys(path);

        driver.findElement(By.id("file-submit")).click();

        Assert.assertTrue(
                driver.findElement(By.xpath("//*[.='File Uploaded!']")).isDisplayed());

        Thread.sleep(3000);
    }


}

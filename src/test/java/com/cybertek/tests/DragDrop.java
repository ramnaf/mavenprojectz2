package com.cybertek.tests;

import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DragDrop extends TestBase {

    @Test
    public void test() throws InterruptedException {

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");


        WebElement source = driver.findElement(By.id("draggable"));

        Thread.sleep(3000);
        WebElement target = driver.findElement(By.id("droptarget"));

        Thread.sleep(3000);
        //pass the variable in the correct order first one is source second one is target

        actions.dragAndDrop(source, target).perform();


        Thread.sleep(3000);
    }


    @Test
    public void test1() throws InterruptedException {

        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");


        WebElement source = driver.findElement(By.id("draggable"));

        Thread.sleep(3000);

        WebElement target = driver.findElement(By.id("droptarget"));

        Thread.sleep(3000);


        //write the steps for doing the drag and drop operation
        //without using the draganddrop(); mehtod


       // actions.moveToElement(source).clickAndHold().moveToElement(target).release().perform();


        actions.clickAndHold(source).moveToElement(target).release().build().perform();
        //when you do multiple actions in one line you have to put build();method before perform();in the code

        Thread.sleep(3000);
    }

}

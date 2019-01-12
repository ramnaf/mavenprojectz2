package com.cybertek.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExample {

    @Test

    public void test1() {
        System.out.println("starting");
        Assert.assertTrue(false);
        System.out.println("done");
    }


    @Test
    public void test2() {
        SoftAssert softAssert = new SoftAssert();
        System.out.println("starting");
        softAssert.assertTrue(false);
        System.out.println("done");
        softAssert.assertEquals("Google", "Etsy");
        //   softAssert.assertEquals(3,1);
        softAssert.assertAll();//will go back to report actually which one failed
    }

    @Test
    public void test3() {
        SoftAssert softAssert = new SoftAssert();
        System.out.println("starting");
        softAssert.assertTrue(false);//comes from soft assert class
        Assert.assertTrue(false);//comes from normal assert class,below soft
        // assert will not affect each other,but
        System.out.println("done");
        softAssert.assertAll();//usually put into @afterclass
        //softassersion fails some times is that there is a critical bug  .

    }


}

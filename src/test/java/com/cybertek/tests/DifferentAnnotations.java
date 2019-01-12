package com.cybertek.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DifferentAnnotations {



    @Test
    public void testOne(){

        System.out.println("This is test one");
    }


    @Test

    public void testTwo(){

        System.out.println("This is test two");
    }


    @AfterMethod

    public void AfterMethod(){

        System.out.println("This is After Method");
    }




    @AfterClass

    public void AfterClass(){

        System.out.println("This is After Class");
    }
}

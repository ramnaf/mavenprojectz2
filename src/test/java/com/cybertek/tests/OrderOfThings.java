package com.cybertek.tests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OrderOfThings {


    @Test(priority = 0)
    public  void  test1(){


        System.out.println("Executing 1");
    }
    @Test(priority = 5-6)
    public  void  atest2(){


        System.out.println("Executing 2");
    }

   @Ignore
    @Test(priority = -1)
    public  void  test3(){


        System.out.println("Executing 3");
    }



}

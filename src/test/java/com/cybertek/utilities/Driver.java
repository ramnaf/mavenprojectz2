package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    //Singleton desighn pattern : share same object across the all class of the application

    //we have a class with a static variable ,and getter method. how the getter works?
    //1. if checks of driver object has  value
    //2. if driver is not initialized it will be initilized inside the if clause
    //3. it will return the driver object
    //4. it driver is already initilized

    //
    private static WebDriver driver;
   // create below constructor is private u cannot create object from it
    private Driver(){


    }

    public static WebDriver getDriver() {

        if (driver == null) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }

        return driver;

    }
}

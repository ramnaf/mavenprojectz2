package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes {

   /*

   https://the-internet.herokuapp.com/
   verfy enter email and submit
   verify email sent message on the next page

    */


    public static void main(String[] args) {

       System.setProperty("sdsd","dgf");

        WebDriverManager.chromedriver().setup();

         WebDriver driver = new ChromeDriver();

    driver.get("https://the-internet.herokuapp.com/forgot_password");

        WebElement input = driver.findElement(By.id("email"));

       // input.sendKeys("somemeail@someemail.com"+ Keys.BACK_SPACE);
       // input.sendKeys("somemeail@someemail.com"+ Keys.ENTER);

       input.sendKeys("somemeail@someemail.com");
       input.submit();


       String expected = "Your e-mail's been sent!";
       String actual = driver.findElement(By.id("content")).getText();


  if(actual.equals(expected)){

      System.out.println("PASS");
  }else{

      System.out.println("FAIL");
      System.out.println("actual " + actual);
      System.out.println("expected " + expected);

  }


    }
}

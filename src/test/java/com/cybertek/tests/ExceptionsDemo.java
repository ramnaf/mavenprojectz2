package com.cybertek.tests;

public class ExceptionsDemo {

    public static void main(String[] args) {


        //i teach on tuesdays ---> normal flow
        //if i get sick,---> problem issue
        // some will replace me    --> alternative flow



        try{
            System.out.println("maruf is teaching on tuesday");


        }catch(Exception e){

            System.out.println("Akbar will take over");
        }
    }

}

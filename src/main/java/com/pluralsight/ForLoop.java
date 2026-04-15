package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {


        //Using a for loop, we count from 10 to 1

        for (int i = 10; i >= 1; i --){
            System.out.println(i);

            Thread.sleep(1000); //Delaying the countdown



        }
        System.out.println("Launch!");  //Marking the end of the countdown


    }
}

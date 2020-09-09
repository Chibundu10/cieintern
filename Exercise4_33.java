package com.cie;

/* Created By Chibundu Omoji
 * on 9/8/2020 - by 2:15 PM
 */

//4.33 (Multiples of 2 with an Infinite Loop)
//        Write an application that keeps displaying in the
//        command window the multiples of the integer 2—namely,
//        2, 4, 8, 16, 32, 64, and so on. Your loop should
//        not terminate (i.e., it should create an infinite loop).
//        What happens when you run this program?


public class Exercise4_33 {
    public static void main(String[]args){

        for (int i = 2; true; i*=2){
            System.out.println(i);
        }


    }
}

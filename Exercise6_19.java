package com.cie;

/* Created By Chibundu Omoji
 * on 10/9/2020 - by 5:13 PM
 */
//6.19 (Displaying a Square of Any Character) Modify the method created in Exercise 6.18 to receive
//        a second parameter of type char called fillCharacter. Form the square using the char provided
//        as an argument. Thus, if side is 5 and fillCharacter is #, the method should display
//        #####
//        #####
//        #####
//        #####
//        #####
//        Use the following statement (in which input is a Scanner object) to read a character from the user
//        at the keyboard:
//        char fill = input.next().charAt(0);

import java.util.Scanner;

public class Exercise6_19 {
    public static void squareOfAnyCharacter(int sqr, char fill) {

        // for loop condition
        for (int j = 1; j <= sqr; j++) {
            for (int k = 1; k <= sqr; k++)
                System.out.print(fill);
            System.out.println();
        } // end for loop
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of square: ");
        int square = input.nextInt();
        System.out.print("Enter filling character: ");
        char filling = input.next().charAt(0);

        //calling squareOfAsterisk method
        squareOfAnyCharacter(square, filling);
    }
}
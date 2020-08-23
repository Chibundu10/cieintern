
//CHAPTER TWO - Exercise 2.14
//2.14 Write an application that displays the numbers 1 to 4 on the same line, with each pair of
//        adjacent numbers separated by one space. Use the following techniques:
//        a) Use one System.out.println statement.
//        b) Use four System.out.print statements.
//        c) Use one System.out.printf statement.
package com.cie;

public class Exercise2_14 {
    public static void main(String[]args){
        System.out.println("1  2  3  4");
        System.out.print("  1  2  3  4\n");
        System.out.print("    1  2  3  4\n");
        System.out.print("      1  2  3  4\n");
        System.out.print("        1  2  3  4\n");
        System.out.printf("\t\t\t1  2  3  4");
    }
}

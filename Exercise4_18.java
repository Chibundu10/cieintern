package com.cie;

import java.util.Scanner;

/* Created By Chibundu Omoji
 * on 8/27/2020 - by 3:38 PM
 */
//4.18 (Credit Limit Calculator) Develop a Java application that determines whether any of several
//        department-store customers has exceeded the credit limit on a charge account. For each customer,
//        the following facts are available:
//        a) account number
//        b) balance at the beginning of the month
//        c) total of all items charged by the customer this month
//        d) total of all credits applied to the customer’s account this month
//        e) allowed credit limit.
//        The program should input all these facts as integers, calculate the new balance (= beginning balance
//        + charges – credits), display the new balance and determine whether the new balance exceeds the
//        customer’s credit limit. For those customers whose credit limit is exceeded, the program should display
//        the message "Credit limit exceeded".

public class Exercise4_18 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("--------Welcome to Prudent Stores---------");
        System.out.println();
        System.out.println();

        int count = 1;
        System.out.print("How many customers details do you want to enter: ");
        int cus = input.nextInt();

        System.out.println("OK");
        System.out.println("Please wait..........");
        System.out.println();

        while (count <= cus) {
            System.out.print("Please enter customer's account Number: ");
            int acctNum = input.nextInt();

            System.out.print("Enter this month's beginning balance: ");
            int beginBal = input.nextInt();

            System.out.print("Enter total number of items of customer this month: ");
            int items = input.nextInt();

            System.out.print("Enter customer's total charge this month:  ");
            int charge = input.nextInt();

            System.out.print("Enter total customer applied credits this month: ");
            int credit = input.nextInt();

            int AllowedCreditLimit = 1000;

            int NewBal = beginBal + charge-credit;

            if (NewBal > AllowedCreditLimit) {
                System.out.println();
                System.out.println("Credit limit exceeded!!!");
            }
            if (NewBal < AllowedCreditLimit){
                System.out.println();
                System.out.println("Credit limit not exceeded!!!");
            }

            System.out.println();
            System.out.println("Customers Account Number: "+ acctNum);
            System.out.println("Customers Beginning Balance: "+ beginBal);
            System.out.println("Total month's item: "+ items);
            System.out.println("Customers Credit: "+ credit);
            System.out.println("Customer's New Balance: "+ NewBal);
            System.out.println();
            System.out.println();
            System.out.println("Enter for another customer ?? ");
            System.out.println();
            count = count + 1;

        }

    }



}

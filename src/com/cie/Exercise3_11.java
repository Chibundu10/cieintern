package com.cie;

/* Created By Chibundu Omoji
 * on 8/24/2020 - by 2:40 PM
 */

//3.11 (Modified Account Class) Modify class Account (Fig. 3.8) to provide a method called withdraw
//        that withdraws money from an Account. Ensure that the withdrawal amount does not exceed
//        the Account’s balance. If it does, the balance should be left unchanged and the method should print
//        a message indicating "Withdrawal amount exceeded account balance." Modify class AccountTest
//        (Fig. 3.9) to test method withdraw.

import java.util.Scanner;

public class Exercise3_11 {
    private String name;
    private double balance;
    private double deposit;

    public Exercise3_11 (String name, double balance, double deposit) {
        this.name = name;
        this.balance = balance;
        this.deposit = deposit;
    }

    public void Withdrawal (double withdraw) {
        balance = balance - withdraw;
    }

    public void Deposit (double deposit){
        balance = balance + deposit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDeposit() {

        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        Exercise3_11 account1 = new Exercise3_11( " ", 0.0, 0.0);

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        account1.setName(name);

        System.out.print(" ");
        System.out.println(" ");

        System.out.print("What do you want to do\n");
        System.out.print(" ");
        System.out.print(" ");
        System.out.println("Press 1 to input current balance");
        System.out.println("Press 2 to deposit to current balance");
        System.out.println("Press 3 to withdraw");
        System.out.print("Enter your choice: ");
        int answer = input.nextInt();

        if (answer == 1) {
            System.out.print("Enter your current balance: ");
            double balance = input.nextDouble();

            System.out.print("Your Name is: " + account1.getName());
            System.out.print("Your Current Balance is: " + balance);
        }

        if (answer == 2) {
            System.out.print("Enter your balance: ");
            double balance = input.nextDouble();
            account1.setBalance(balance);

            System.out.print(" ");

            System.out.print("Enter Amount you want to deposit: ");
            double deposit = input.nextDouble();
            account1.Deposit(deposit);

            System.out.println("Your Name is: " + account1.getName());
            System.out.println("Your Deposited Amount is: " + deposit);
            System.out.println("Your Balance Amount is: " + account1.getBalance());
        }

        if (answer == 3) {

            System.out.print("Enter your current balance: ");
            double balance = input.nextDouble();
            account1.setBalance(balance);

            System.out.println(" ");

            System.out.print("Enter Amount to withdraw: ");
            double withdraw = input.nextDouble();
            account1.Withdrawal(withdraw);

            System.out.println("Your Name is: " + account1.getName());
            System.out.print("Your Current Balance is: " + account1.getBalance());
        }

    }
}

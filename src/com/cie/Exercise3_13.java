package com.cie;

/* Created By Chibundu Omoji
 * on 8/24/2020 - by 10:59 PM
 */

//3.13 (Employee Class) Create a class called Employee that includes three instance variables—a
//        first name (type String), a last name (type String) and a monthly salary (double). Provide a constructor
//        that initializes the three instance variables. Provide a set and a get method for each instance
//        variable. If the monthly salary is not positive, do not set its value. Write a test app named EmployeeTest
//        that demonstrates class Employee’s capabilities. Create two Employee objects and display each
//        object’s yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly salary
//        again.

public class Exercise3_13 {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Exercise3_13(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public static void main(String []args){
        System.out.println(" ");
        System.out.println(" ");
        Exercise3_13 employee1 = new Exercise3_13("Vincent", "Chuks", 15500.00);
        Exercise3_13 employee2 = new Exercise3_13("Chibundu", "Omoji", 22000.00);
        System.out.print(" ");
        System.out.print(" ");
        System.out.print(" ");
        System.out.printf("First Employee's full name is: %s %s and yearly salary is: %.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1.getMonthlySalary()*12*1550);
        System.out.print(" ");
        System.out.printf("Second Employee's full name is: %s %s and yearly salary is: %.2f", employee2.getFirstName(), employee2.getLastName(), employee2.getMonthlySalary()*12*2200);

    }
}

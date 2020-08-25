package com.cie;

/* Created By Chibundu Omoji
 * on 8/24/2020 - by 10:04 PM
 */

//3.12 (Invoice Class) Create a class called Invoice that a hardware store might use to represent
//        an invoice for an item sold at the store. An Invoice should include four pieces of information as
//        instance variables—a part number (type String), a part description (type String), a quantity of the
//        item being purchased (type int) and a price per item (double). Your class should have a constructor
//        that initializes the four instance variables. Provide a set and a get method for each instance variable.
//        In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e.,
//        multiplies the quantity by the price per item), then returns the amount as a double value. If the
//        quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to
//        0.0. Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities.

public class Exercise3_12 {

    private String number;
    private String description;
    private int quantity;
    private double pricePerItem;

    public Exercise3_12(String number, String description, int quantity, double pricePerItem) {
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount(){
        return pricePerItem * quantity;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0)
            quantity = 0;
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem < 0.0)
            pricePerItem = 0.0;
        this.pricePerItem = pricePerItem;
    }

    public static void main (String[]args){
        Exercise3_12 Item1 = new Exercise3_12("1", "Peak Milk", 3, 120);
        Exercise3_12 Item2 = new Exercise3_12("2", "Sugar", 2, 350);
        Exercise3_12 Item3 = new Exercise3_12("3", "Lipton", 1, 400);
        Exercise3_12 Item4 = new Exercise3_12("4", "Apple Juice", 3, 500);
        Exercise3_12 Item5 = new Exercise3_12("5", "Bread", 5, 80);

        System.out.println(" ");
        System.out.println(" ");
        System.out.print("------------------Delight Stores------------------\n\n");
        System.out.print("Invoice for Items bought on the 24th of August, 2020\n\n");
        System.out.printf("Number\t Description\t Quantity\t Price\n\n");
        System.out.printf("%s\t\t %s\t\t %d\t\t\t %.2f%n", Item1.getNumber(), Item1.getDescription(), Item1.getQuantity(), Item1.getInvoiceAmount());
        System.out.printf("%s\t\t %s\t\t\t %d\t\t\t %.2f%n", Item2.getNumber(), Item2.getDescription(), Item2.getQuantity(), Item2.getInvoiceAmount());
        System.out.printf("%s\t\t %s\t\t\t %d\t\t\t %.2f%n", Item3.getNumber(), Item3.getDescription(), Item3.getQuantity(), Item3.getInvoiceAmount());
        System.out.printf("%s\t\t %s\t %d\t\t\t %.2f%n", Item4.getNumber(), Item4.getDescription(), Item4.getQuantity(), Item4.getInvoiceAmount());
        System.out.printf("%s\t\t %s\t\t\t %d\t\t\t %.2f%n", Item5.getNumber(), Item5.getDescription(), Item5.getQuantity(), Item5.getInvoiceAmount());

    }
}

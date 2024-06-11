/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04_2_exercise;

/**
 *
 * @author Mathabatha
 */
public class ShoppingCart {

//1. Declare and initialize numeric fields. Include price and tax (double), 
//     quantity (int). Also declare a double called total, but do not initialize it.
//2. Change the message variable to include quantity 
//      (example: "Mary Smith wants to purchase 1 Shirt.")
//3. Calculate total by multiplying price * quantity * tax.
//4. Print a message showing the total cost. 
//      (example:  "Total cost with tax is: 25.78.") 
    public static void main(String[] args) {
        double price = 199.99;
        double tax = 0.15;
        int quantity = 100;
        double total = price * quantity * tax;

        String custName = "Katlego";
        String itemDesc = "Shirt";
        String message;
        String message2;
        message2 = "Total cost with tax is:" + total;
        message = custName + " " + "wants to buy" + " " + quantity + " " + itemDesc + "s";

        System.out.println(message);
        System.out.println(message2);
    }

}

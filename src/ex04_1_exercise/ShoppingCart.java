/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04_1_exercise;

/**
 *
 * @author Mathabatha
 */
public class ShoppingCart {
//    Exercise 4-1:
//
//1.  Declare and initialize 2 String variables: custName and itemDesc
//2.  Declare a String variable called message.  Do not initialize it.
//3.  Assign the message variable with a concatenation of the custName and itemDesc.  
//     Include a String literal that results in a complete sentence.  
//     (example: "Mary Smith wants to purchase a Shirt")
//4.  Print the message to the System output.
//5.  Run the code.

    public static void main(String[] args) {
        String custName = "Katlego";
       String itemDesc = "Shirt";
       String message;
      message = custName +" " + "wants to buy a" + " " + itemDesc;
       System.out.println(message);

//        double num1 = 10;
//        double num2 = 2;
//        
//        double quot = num1 / num2;
//        
//        System.out.println(quot);
//        int age = 70;
//        int count = 21;
//
//        age++;
//        count--;
//        System.out.println(count);

    }

}

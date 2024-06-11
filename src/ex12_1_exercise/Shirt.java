/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//1.  Examine the Item class.  Pay close attention to the 
//      overloaded constructor and also the display method.
//2.  Create a new class called Shirt that inherits from Item.
//3.  Declare two private char fields: size and colorCode
//4.  Create a constructor method that takes 3 args(price, size, colorCode).  
//5.  The constructor should:
//	- Call the 2-arg constructor in the superclass, sending a String 
//            literal for the desc arg ("Shirt") and pass the price argument 
//            from this constructor. 
//	-  Assign the size and colorCode fields.
//
//In the ShoppingCart class, 
//6.  Declare and instantiate a Shirt object, using the 3 arg constructor.
//7.  Call the display() method on the object reference. 
//      Where is the display method coded?

package ex12_1_exercise;

/**
 *
 * @author Mathabatha
 */
public class Shirt extends Item{
    private char size = 'M';
    private char colorCode = 'U';
    
    public Shirt(double price, char size, char colorCode){
        super("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
        
    }
    
    
}

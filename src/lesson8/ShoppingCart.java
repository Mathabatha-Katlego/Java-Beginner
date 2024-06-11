/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson8;

/**
 *
 * @author Mathabatha
 */
public class ShoppingCart {

    public static void main(String[] args) {
//        Shirt myShirt = new Shirt();
//        myShirt.display();
Shirt shirt01 = new Shirt();
Shirt shirt02 = new Shirt();
Shirt shirt03 = new Shirt();
Shirt shirt04 = new Shirt();

shirt01.setFields("Blue", 'S', 36);
shirt02.setFields("Pants", 'L', 25);
shirt03.setFields("Yellow", 'G', 28);
shirt04.setFields("Jean", 'M', 30);

    }
}

class Shirt {

    public String description;
    public char colorCode;
    public double price;

//    public Shirt() {
//        description = "Description required";
//        colorCode = 'U';
//        price = 0.0;
//
//    }

//    public void display() {
//        System.out.println("Item Description: " + description);
//        System.out.println("Color code: " + colorCode);
//        System.out.println("Item price: " + price);
//    }
//    
    public void setFields(String description, char color, double price) {
        this.description = description;
        this.colorCode = color;
        this.price = price;
    }
   
}

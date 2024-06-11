/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson6;

/**
 *
 * @author Mathabatha
 */
public class Lesson6 {

    public static void main(String[] args) {
        Customer customer01 = new Customer();
        Customer customer02 = new Customer();

        customer01.age = 40;
        customer01.name = "Katlego";
        customer02.name = "Duke";
        customer02.age = 50;

        customer01.displayCustomer();
        customer02.displayCustomer();
        customer01.cart.cancel();
    }

}

class Customer {

    public Cart cart = new Cart();
    public String name;
    public int age;

    public void displayCustomer() {
        System.out.println("Customers name is " + name + " and age is " + age);

    }
}

class Cart {

    public Item[] item;

    public void cancel() {
        System.out.println("Cancel cart");

    }
}

class Item {

}

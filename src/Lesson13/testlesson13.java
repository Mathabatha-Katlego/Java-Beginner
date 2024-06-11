/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson13;

/**
 *
 * @author Mathabatha
 */
public class testlesson13 {

    public static void main(String[] args) {
        Trousers t1 = new Trousers();
        Clothing c1 = new Trousers();
        Returnable r1 = new Trousers();
        
        t1.display();
        c1.getItemID();
        t1.doReturn();
        t1.getFit();
        
        c1.display();
        c1.getItemID();
        
        r1.doReturn();
        
        if(c1 instanceof Trousers) {
            System.out.println(((Trousers)c1).getFit());
        }
         if(r1 instanceof Trousers) {
            System.out.println(((Trousers)r1).getFit());
        }
        
    }

}

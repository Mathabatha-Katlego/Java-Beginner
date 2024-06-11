/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lesson12;

/**
 *
 * @author Mathabatha
 */
public class Testinheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Shirt shirt02 = new Shirt(1, "Long Sleeve", 'B', 19.99, 'M');
//        shirt02.display();
//        System.out.println(shirt02.getColorCode());

        Clothing c1 = new Trousers(1, "Trouser", 'B', 19.99, 'S', 'M');
        c1.getItemID();
        c1.display();
        if(c1 instanceof Trousers){
            System.out.println("Fit is " + ((Trousers) c1).getFit());  
        }
        
    }

}

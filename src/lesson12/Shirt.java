/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12;

/**
 *
 * @author Mathabatha
 */
public class Shirt extends Clothing {

    private char fit = 'U';

    public Shirt(int itemID, String desc, char colorCode, double price, char fit){
        super(itemID, desc, colorCode,price);
        this.fit = fit;
        
    }
    public void display(){
        System.out.println("Item id " + super.getItemID());
        System.out.println("Item Description " + super.getDesc());
        System.out.println("ColorCode " + super.getColorCode());
        System.out.println("Price " + super.getPrice());
        System.out.println("Fit "+ fit);
    }

    /**
     * @return the fit
     */
    public char getFit() {
        return fit;
    }

    /**
     * @param fit the fit to set
     */
    public void setFit(char fit) {
        this.fit = fit;
    }
    
}

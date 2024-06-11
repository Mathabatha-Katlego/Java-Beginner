/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson13;



/**
 *
 * @author Mathabatha
 */
public class Trousers extends Clothing implements Returnable {

    private char fit;
    private char gender;

    public Trousers(int itemID, String desc, char colorCode, double price, char fit, char gender) {
        super(itemID, desc, colorCode, price);
        this.fit = fit;
        this.gender = gender;
    }
       public Trousers() {
        super(1, "Trousers", 'U', 0.00);
        this.fit = 'S';
        this.gender = 'M';
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

    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }
    @Override
      public void display(){
        System.out.println("Item id " + super.getItemID());
        System.out.println("Item Description " + super.getDesc());
        System.out.println("ColorCode " + super.getColorCode());
        System.out.println("Price " + super.getPrice());
        System.out.println("Fit "+ fit);
    }
 @Override
public String toString() {
    return "Item id " + super.getItemID() + "\nItem Description " + super.getDesc() + "\nColor Code " + super.getColorCode() + "\nItem Price " + super.getPrice() + "\nFit " + fit + "\nGender " + gender;
}

    @Override
    public String doReturn() {
        return "Trousers that were ammended, cannot be returned!";
    }

    

}

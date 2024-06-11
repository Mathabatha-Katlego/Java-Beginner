/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson9;

/**
 *
 * @author Mathabatha
 */




class Shirt {

    private char colorCode;

    public char getColorCode() {
        return colorCode;
    }

    public void setColorCode(char colorCode) {
        if (colorCode == 'R' || colorCode == 'G' || colorCode == 'B') {
            this.colorCode = colorCode;
        } else {
            System.out.println("Invalid color code. Use R, G, or B");
        }
    }
}

public class shirtTest {

    public static void main(String[] args) {
        Shirt theShirt = new Shirt();
        char colorCode;
        // set a valid colorCode
        theShirt.setColorCode('R');
        colorCode = theShirt.getColorCode();
        System.out.println("Color Code: " + colorCode);
        // set an invalid color code
        theShirt.setColorCode('Z');
        colorCode = theShirt.getColorCode();
        System.out.println("Color Code: " + colorCode);
    }
}

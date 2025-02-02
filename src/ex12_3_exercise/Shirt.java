package ex12_3_exercise;
//In the Shirt class:
//1.  Add a public getColor method that converts the colorCode field 
//      into the corresponding color name (example: 'R' = "Red"). Include
//      at least 3 colorCode/color combinations.  
//2.  Use a switch statement in the method and return the color String. 



public class Shirt extends Item{
    private char size;
    private char colorCode;
    
    public Shirt(double price, char size, char colorCode){
        super ("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    }
    
    public void display(){
        super.display();
        System.out.println("\tSize: "+size);
        System.out.println("\tColor Code: "+ colorCode);
    } 
    
    // Code a public getColor method that converts the colorCode to a the color name
       // Use a switch statement.  Return the color name. 
    public String getColor(){
        switch(colorCode){
            case 'R':
                return "Red";
            case 'B':
                return "Blue";
            case 'Y':
                return "Yellow;";
            default:
                return "invalid color";
        }
    }

}

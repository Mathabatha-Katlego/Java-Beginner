//1. Use the indexOf method to get the index for the space character (" ")
//     within custName.  Assign it to spaceIdx.
//2. Use the substring method and the spaceIdx to get the first name
//     portion of custName.  Assign it to firstName.  Print firstName.
package ex07_1_exercise;



public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx = 0;

        // Get the index of the space character (" ") in custName. 
        int firstIndex = custName.indexOf(" ");
        System.out.println(firstIndex);

        // Use the substring method parse out the first name and print it.
        firstName = custName.substring(0, firstIndex);
        System.out.println(firstName);

    }
}


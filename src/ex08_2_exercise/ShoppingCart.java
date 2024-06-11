//3. Call the 3-arg setItemFields method and then call item1.displayItem()
//4. Call the 4-arg setItemFields method, checking the return value.  
//     If the return value < 0, print an invalid color code message,
//     otherwise call displayItem.
package ex08_2_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        Item item1 = new Item();

        // Call the 3-arg setItemFields method and then call displayItem.
        item1.setItemFields("Belt", 1, 29.50);
        item1.displayItem();

        // Call the 4-arg setItemFields method, checking the return value.  
       if (item1.setItemFields("Shirt", 1, 34.99, ' ') < 0) {
            System.out.println("Invalid color code.  Item not added.");
        } else {
            item1.displayItem();
        }
    }
}

// Test your code for both valid and invalid values


//In the ShoppingCart class:
//2. Declare, instantiate, and initialize a new Customer object
//    by calling the custom constructor.  
//3. Test it by printing the customer object name 
//    (call getName method).
package ex09_2_exercise;

public class ShoppingCart {
    public static void main(String args[]){

        // Declare, instantiate, and initialize a Customer object
        Customer cust1 = new Customer("Katlego", "585-123-4567");

	// Print the customer object name
        System.out.println("Customer name: "+cust1.getName() + " " + cust1.getSSN());
    }    
}



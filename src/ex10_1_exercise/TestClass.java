//In the TestClass:
//1. Use a ternary operator to perform the same logic as
//     shown in the if | else construct.  
//2. Print the result of the ternary operator.
//     (Keep in mind, that the if statement changes the value
//     of x, so the output of the second print statement will
//     be different than the first.)
package ex10_1_exercise;


public class TestClass {

    public static void main(String args[]) {
        int x = 4, y = 9;
        if (y / x < 3) {
            x += y;
        } else {
            x *= y;
        }
        System.out.println("After if stmt, x = " + x);
        
         // Use a ternary operator to perform the same logic as above.
         x = ((y / x < 3)) ? (x+=y) : (x *= y);
         System.out.println("After ternary op, x " + x);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson8;

/**
 *
 * @author Mathabatha
 */
public class lesson8 {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double denominator = 2.0;
        calc.calculate(6,denominator);

    }

}
class Calculator {
    public void calculate(int x, double y){
        System.out.println(x/y);
        System.out.println(x + y);
    }
}
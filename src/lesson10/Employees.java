/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson10;

/**
 *
 * @author Mathabatha
 */
public class Employees {

    public static void main(String[] args) {
//        Employees employees = new Employees(); // Create an instance of Employees
//        employees.areNamesEqual(); // Call the areNamesEqual method 
        Employees.printGoalsMessage();
//    }
//
//    public String name1 = "Katlego Mohlaloga";
//    public String name2 = "Motlatjo Matlhoma";
//
//    public void areNamesEqual() {
//        if (name1.equals(name2)) {
//            System.out.println("Same Name");
//        } else {
//            System.out.println("Different Name");
        // }
        //ignores the case
//    public String name1 = "Fred Smith";
//    public String name2 = "fred smith";
//    
//    public void areNamesEqual() {
//        if(name1.equalsIgnoreCase(name2)) {
//            System.out.println("Same name");
//        }
//        else{
//            System.out.println("Different name");
//        }
//public String name1 = new String("Fred Smith");
//public String name2 = new String("Fred Smith");
//
//public void areNamesEqual() {
//    if(name1 == name2) {
//        System.out.println("Same name");
//    }
//    else {
//        System.out.println("Different name");
//    }
//} 
    }

    public static void printGoalsMessage() {
        int numberOfGoals = 1;
        String s = (numberOfGoals == 1 ? "goal" : "goals");
        System.out.println("I scored " + numberOfGoals + " " + s);
    }
;

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Mathabatha
 */
public class TestToString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Shirt shirt02 = new Shirt(1, "Long Sleeve", 'B', 19.99, 'M');
//
//
//        Clothing c1 = new Trousers(1, "Trouser", 'B', 19.99, 'S', 'M');
//        
//        System.out.println(c1);
//        System.out.println(shirt02);
//        System.out.println(shirt02.doReturn());

//String[] nums = {"one", "two" , "three"};
//
//ArrayList<String> myArrayList = new ArrayList(Arrays.asList(nums));
//Lamdas
        String[] days = {"monday", "saturday", "tuesday", "sunday", "friday"};
        ArrayList<String> daysArrayList = new ArrayList(Arrays.asList(days));
        for (String day : daysArrayList) {
            if (day.equalsIgnoreCase("sunday")) {
                System.out.println(day.toUpperCase());
            } else {
                System.out.println(day);
            }

        }
        System.out.println(daysArrayList);
        daysArrayList.replaceAll(day -> day.toUpperCase());
        System.out.println(daysArrayList);
        daysArrayList.removeIf(day -> day.equalsIgnoreCase("Saturday"));
        System.out.println(daysArrayList);
    }
}

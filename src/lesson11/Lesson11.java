/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson11;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;

/**
 *
 * @author Mathabatha
 */
public class Lesson11 {

    public static void main(String[] args) {
        //    LocalDate myDate = LocalDate.now();
//        System.out.println("Today's date: " + myDate);
//        myDate.format(DateTimeFormatter.ISO_DATE);
//        System.out.println(myDate);
//        JapaneseDate jDate = JapaneseDate.from(myDate);
//        System.out.println("Japanese date: "+ jDate);

        // System.out.println(myDate.minusMonths(15));
//        LocalDateTime today = LocalDateTime.now();
//        System.out.println("Today's date time(no formatting): " + today);
//
//        String sdate = today.format(DateTimeFormatter.ISO_DATE);
//        System.out.println("Date in ISO_Date_Time format: " + sdate);
//
//        String fdate = today.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
//        System.out.println("Formatted with Medium FormatStyle: " + fdate);
//        int[][] yearlySales;
//        yearlySales = new int[5][4];
//        yearlySales[0][0] = 1000;
//        yearlySales[0][1] = 1500;
//        yearlySales[0][2] = 1800;
//        yearlySales[1][0] = 1000;
//        yearlySales[3][3] = 2000;
//While loop
//        System.out.println("/*");
//        int counter = 0;
//        while (counter < 3) {
//            System.out.println(" *");
//            counter++;
//        }
//        System.out.println("*/");
//for Loop
//        for (int i = 1; i < 5; i++) {
//            System.out.print("i = " + i + "; ");
//        }
//        int i = 1;
//        while (i < 5) {
//            System.out.println("i = " + i + "; ");
//            i++;
//        }
//        System.out.println("Loop complete");
//        String[] names = {"Katlego", "Motlatjo", "Tebogo"};
//        for (String name : names) {
//            System.out.println(name);
//        }
//        for (int idx = 0; idx < names.length; idx++) {
//            System.out.println(names[idx]);
        //  }
        // factorial(5);
//        int height = 4, width = 10;
//
//        for (int row = 0; row < height; row++) {
//            for (int col = 0; col < width; col++) {
//                System.out.print("@");
//            }
//            System.out.println();
//        }
// Nested while loop
//        String name = "Katlego";
//        String guess = "";
//        int attempts = 0;
//        while (!guess.equalsIgnoreCase(name)) {
//            guess = "";
//            while (guess.length() < name.length()) {
//                char asciiChar = (char) (Math.random() * 26 + 97);
//                guess += asciiChar;
//            }
//            attempts++;
//        }
//        System.out.println(name + " found after " + attempts + " tries!");
//        int sales[][] = new int[3][4];
//        int[][] salesArray = initArray(sales);
//        System.out.println("Yearly sales by quartely beginning 2010:");
//        for (int i = 0; i < salesArray.length; i++) {
//            for (int j = 0; j < salesArray[i].length; j++) {
//                System.out.println("\tQ" + (j + 1) + " " + salesArray[i][j]);
//            }
//            System.out.println();
//        }
//    }
//
//    static int[][] initArray(int[][] salesArray) {
//        int salesAmt = 100;
//        for (int outer = 0; outer < 3; outer++) {
//            for (int inner = 0; inner < 4; inner++) {
//                salesArray[outer][inner] = salesAmt++;
//            }
//
//        }
//        return salesArray;
//    }
        ArrayList<String> names;
        names = new ArrayList();

        names.add("Katlego");
        names.add("Thabo");
        names.add("Steve");
        names.add("Jose");
        names.add("Prashant");

        System.out.println(names);
        
        names.remove(0);
        names.remove(names.size() - 1);
        names.remove("Jose");
        System.out.println(names);

    }

//    static void factorial(int target) {
//        int save = target;
//        int fact = 1;
//        do {
//            fact *= target--;
//        }while(target > 0);
//        System.out.println("Factorial for "+save+": " + fact);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson14;

/**
 *
 * @author Mathabatha
 */
public class Utils {

    public void doThis() {
        System.out.println("Arrivedd in dothis()");
        try{
        doThat();
        }catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("Back in doThis()");
    }

    public void doThat() throws Exception {
        System.out.println("In doThat()");

        throw new Exception();
    }

    public static void main(String[] args) {
        Utils u = new Utils();
        u.doThis();
    }
}

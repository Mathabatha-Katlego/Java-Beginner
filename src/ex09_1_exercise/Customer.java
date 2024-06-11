//1. Encapsulate this class.  Change access modifiers so that fields can
//     be read or changed on through public methods.  
//     The ssn field should be READ ONLY.
package ex09_1_exercise;



public class Customer {
    public static void main(String[] args) {
        
    }
    public String name;
    public String ssn;
   
    // Encapsulate this class.  Make ssn read only.
     public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    
    public String getSSN(){
        return ssn;
    }
        

}

 


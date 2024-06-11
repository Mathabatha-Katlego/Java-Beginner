package ex09_2_exercise;

//In the Customer class:
//1. Add a custom constructor that initializes the fields.
//


public class Customer {
    private String name;
    private String ssn;
   
    //Add a custom constructor
    public Customer(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
    
    
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

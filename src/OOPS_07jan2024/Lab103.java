package src.OOPS_07jan2024;

public class Lab103 {
    public static void main(String[] args) {
        // this
        // constructor
        // inheritance
        // encapsulation
        // abstraction
        // super()

        ATBPerson p=new ATBPerson();
         p.name="Aishwarya";          //DC
       // System.out.println("Name is "+p.name);
       // p.talk();
        p.printDetails(); //if called without setting values of attribute e.g. name in line number 13 then return "Null value" i.e. Default values


        System.out.println("------------------");

        ATBPerson p2=new ATBPerson();
        p2.name="Anya";
        p2.printDetails();

        System.out.println("------------------");

        ATBPerson p3=new ATBPerson("Mr.xyz");  //PC
        p3.printDetails();


        //String s; // Local Variable default value is never assigned by JVM
        //System.out.println(s); //will get error as value is not assigned.

        // Constructor
        // Constructor is used to construct the object of a class.
        // name must be exactly the same as class
        // constructor is a special method.
        // it does not have a return type

        // - Default Constructor 18-19%
        //- Param Constructor - 70%
        // Copy Constructor in Java - <%1
    }

}

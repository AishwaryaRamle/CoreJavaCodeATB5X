package src.OOPS_07jan2024;

public class ATBPerson {
    String name;// instance  variable values are default
    long phone;
    boolean isMarried;
    String courseName;

    //Default constructor
    ATBPerson() {
        courseName="ATB";
        System.out.println("I am Default Constructor");
    }

    // Param Constructor
    ATBPerson(String valuefromObjectRef){
        this.name=valuefromObjectRef;
        System.out.println("I am Parametrized Constructor");
    }
    void talk() {
        System.out.println("Talk!!!");
    }

    void printDetails()
    {
        System.out.println(this.name);
        System.out.println(courseName);
       /* System.out.println(name);
        System.out.println(phone);
        System.out.println(isMarried);
        System.out.println(courseName);*/
    }
}

package src.OOPS_13jan_2024.Encapsulation.Example2;

public class Empmain {
    public static void main(String[] args) {

        //creating instance of the encapsulated class
        Employee e= new Employee();

        e.setId(1);//setting value in the id member
        e.setName("Aishwarya");//We modified private variable value to Aishwarya from test

        //  System.out.println(name); will not allowed as it is private variable.
        System.out.println(e.getName()); //getting value of the name member
        System.out.println(e.getId());
        e.printdetails();


    }
}

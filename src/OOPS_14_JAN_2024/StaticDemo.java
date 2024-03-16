package src.OOPS_14_JAN_2024;

public class StaticDemo {
    //static variable
    static String College_name="The Testing academy";

    // Non static variable -> Local variable or Instance variable
    public int version=1;
//Static Method
    static void printName()
    {
        int age=10;
        System.out.println("College Name is :"+College_name);
        // You can't have an Instance variable into the Static Method!!
        //System.out.println("Version is : " + version);
    }
//Non-Static Method
    public void printDetails()
    {
        int age=10;
        System.out.println("Name is :"+College_name);
        System.out.println("Version is : "+version);
    }
}

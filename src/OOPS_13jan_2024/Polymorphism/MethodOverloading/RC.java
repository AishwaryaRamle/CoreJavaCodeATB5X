package src.OOPS_13jan_2024.Polymorphism.MethodOverloading;

public class RC {
    // Method Overloading
    // Load -> same name different
    public static void main(String[] args) {

        new Person().Gift("Aishwarya");
        new Person().Gift(3.14);
        new Person().Gift(1);
        Person p=new Person();
        p.Gift(5,5);




    }

}

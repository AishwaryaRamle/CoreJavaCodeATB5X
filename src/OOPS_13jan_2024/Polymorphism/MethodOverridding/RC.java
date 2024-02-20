package src.OOPS_13jan_2024.Polymorphism.MethodOverridding;

public class RC {
    public static void main(String[] args) {
        Dog d= new Dog();
        d.bark();

        Hound h=new Hound();
        h.bark();

        Dog f  =  new Hound(); // Dynamic Dispatch
        // Runtime Polymorphism
        f.bark();



        //Hound a = new Dog(); // Java 22 This is not possible
        // Latest java 22 - It is never possible in JAVA
    }
}


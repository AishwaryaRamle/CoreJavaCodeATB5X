package src.OOPS_13jan_2024.Polymorphism.MethodOverloading;

public class CalMain {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println("Sum of int: " + c.add(2,4));
        System.out.println("Sum of double: " + c.add(220.5, 250.63));
//        int add=c.add(5,5);
//       System.out.println(add);
    }
}

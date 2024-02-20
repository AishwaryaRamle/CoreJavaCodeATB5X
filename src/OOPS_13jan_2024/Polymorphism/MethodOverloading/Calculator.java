package src.OOPS_13jan_2024.Polymorphism.MethodOverloading;

public class Calculator {
    int add (int a,int b)
    {
        System.out.println(a+b);
        return a+b;
    }
    double add(double a,double b)
    {
        System.out.println(a+b);
        return a+b;
    }
}

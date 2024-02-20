package src.OOPS_13jan_2024.Polymorphism.MethodOverloading;

public class Person {
    // Method OverLoading -> multiple methods with same name, but different argument.
    void Gift(String a) {
        System.out.println("A is a String " + a);
    }

    void Gift(double x) {
        System.out.println("X is a double" + x);
    }

    int Gift(int x) {
        System.out.println("X is a Int" + x);
        return x;
    }

/*   double Gift(int x){
     System.out.println("X is a Int" +  x);
     return x;}


    int Gift(float d) {
            System.out.println("D is a float" + d);
            return 89;
        }

    Please note that method overloading is determined based on the method signature
    (method name and parameter types), and the return type alone does not differentiate
    overloaded methods. Therefore, having multiple methods with the same name and parameter
    types but different return types (like int Gift(int x) and char Gift(char s))
    is not valid overloading in Java.
    */
    void Gift(int a,int b)
    {
        System.out.println(a+b);
    }


    }



package src.OOPS_13jan_2024.Polymorphism.MethodOverloading;

public class MOMain {
    public static void main(String[] args) {
        MOExp1 obj = new MOExp1();
        obj.Method1();//Method without args is called
        obj.Method2("Hello");//Method with only String arg is called
        obj.Method3("Method3",4);//Method with String and int args is called
        obj.Method4("Method4",4, true );//Method with String, int and boolean args is called
        //This is called as Overloading (Same method name but different arguments
        System.out.println(obj.name);
    }
}

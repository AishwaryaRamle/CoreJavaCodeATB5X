package src.OOPS_13jan_2024.Polymorphism.MethodOverloading;

public class MOExp1 {

    public String name;

    public void Method1() {
        System.out.println("Hi I am method with no argument");
    }


    public void Method2(String name)
    {
        this.name=name;
        System.out.println("Hi I am method with String argument");
    }

    public void Method3(String name, int a)
    {
        System.out.println("Hi I am method with String and int arguments");
    }

    public void Method4(String name, int a, boolean r)
    {
        System.out.println("Hi I am method again with String, int and Boolean arguments");
    }
}

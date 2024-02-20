package src.OOPS_13jan_2024.Assignment.Inheritance.Single;

public class Child extends Parent{
    String name;
    int age;
    Child(String name, int age)
    {
        this.name=name;
        this.age=age;
        properties();

    }

    void properties()
    {
        System.out.println("Child has Parent Properties!!!!");
    }

    void Details()
    {
        System.out.println("Name is "+name+ "Age is "+age);
    }
}

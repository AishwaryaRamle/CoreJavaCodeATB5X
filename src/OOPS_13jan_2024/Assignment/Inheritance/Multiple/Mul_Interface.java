package src.OOPS_13jan_2024.Assignment.Inheritance.Multiple;


interface one
{
    public void The();
}
interface two
{
    public void Testing();
}
interface three extends one,two
{
    public void Academy();
}

public class Mul_Interface
{
    public static void main(String[] args) {
        Child c=new Child();
        c.The();
        c.Testing();
        c.Academy();    }
}
//if implemented new "public" class with different name then class name it shows error to create new class file with .java


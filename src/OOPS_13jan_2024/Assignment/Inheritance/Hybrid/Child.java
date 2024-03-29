package src.OOPS_13jan_2024.Assignment.Inheritance.Hybrid;
//Single and Multiple Inheritance
class HumanBody
{
    public void displayHuman()
    {
        System.out.println("Method defined inside HumanBody class");
    }
}
interface Male
{
    public void show();
}
interface Female
{
    public void show();
}
public class Child extends HumanBody implements Male, Female
{
    public void show()
    {
        System.out.println("Implementation of show() method defined in interfaces Male and Female");
    }
    public void displayChild()
    {
        System.out.println("Method defined inside Child class");
    }
    public static void main(String args[])
    {
        Child obj = new Child();
        System.out.println("Implementation of Hybrid Inheritance in Java");
        obj.show();
        obj.displayChild();
        obj.displayHuman();
                
                
    }
}  
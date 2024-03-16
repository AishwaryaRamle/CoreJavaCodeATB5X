package src.OOPS_14_JAN_2024.Interview_Questions;

public class Lab119 {
    public static void main(String[] args) {
        System.out.println(pp.a); //can access using class variable as all variable in interface are static
        foo f1=new foo();
        f1.m1();
        f1.say();

        System.out.println(" ");
        pp f2=new foo();// Dynamic Dispatch---pp reference to child class foo
        f2.m1();

        System.out.println("\n");
        Rofl f3 =new foo();
        f3.m1();
        f3.say();//Dynamic Dispatch Rofl class reference to child class foo



    }
}
interface pp{
    int a =10;
    // Only Static variables
    void m1();
}

abstract class Rofl implements pp
{
   abstract void say();
}

class foo extends Rofl
{

    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    void say() {
        System.out.println("say");
    }
}

package src.OOPS_14_JAN_2024.Interview_Questions;

public class Lab118 {
    public static void main(String[] args) {
        System.out.println(H.a);
        Aishwarya a=new Aishwarya();
        a.m1();
    }
}

interface H
{
// only static variables are present in interface,can access using class variable.
    int a =10;
    public static final int b = 20;
    public static final int c  =99;
    void m1(); // This is non-static
}
class Aishwarya implements H
{

    @Override
    public void m1() {

    }
}


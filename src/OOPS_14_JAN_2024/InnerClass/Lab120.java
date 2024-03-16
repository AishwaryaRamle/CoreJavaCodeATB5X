package src.OOPS_14_JAN_2024.InnerClass;

public class Lab120 {
    public static void main(String[] args) {
        OuterClass oc=new OuterClass();
        System.out.println("Outer class"+oc.a);

    }

}
class OuterClass
{
    int a=10;//instance variable

    class Innerclass
    {
        int b=20;

        void innerFun1()

        {
          System.out.println(a);
         }

         //inner class can access outer classes functions and variable, but outer class cannot access inner class
    }
}
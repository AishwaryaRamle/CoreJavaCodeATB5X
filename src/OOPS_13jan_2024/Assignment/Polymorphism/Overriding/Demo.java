package src.OOPS_13jan_2024.Assignment.Polymorphism.Overriding;

public class Demo {
    public int get(int a) {
        return 10;
    }
}
    class Test extends Demo{
        public int get(Integer a)
        {
            return 20;
        }

        public static void main(String[] args) {
            Demo d=new Test();
            System.out.println(d.get(1));
        }

    }
    /* The reference type is Demo, but the actual object type is Test.
       Since method overriding is based on the runtime object's type, the get method of Test class will be invoked.
       The method get(Integer a) of Test class accepts Integer type, but the argument passed is of type int.
       In Java, automatic widening conversions are allowed but autoboxing (converting int to Integer) is not applied for
       widening conversions.
       So, the method get(int a) of the Demo class, which matches the argument type exactly, will be invoked.
       Therefore, the output of the code will be 10. So, when you run this code, it will print:10*/
package src.OOPS_13jan_2024.Assignment.Polymorphism.Overloading;

public class MO {
    public void Test(int a) {
        System.out.println(a);
    }
//    public float Test(int f) {   //cannot use as it has same Function name with same parameters and different datatype.
//        return f;
//    }
    public void Test(float f) {
        //f=3.14f;
        System.out.println(f);
    }
    public void Test(String X)
    {
        System.out.println(X);
    }

    public void Test(int a, int b) {
        System.out.println(a + b);
    }
    public String Test(String X,int a) {
       System.out.println(X+" " +a);
        return X;
    }

    public static int Test(int a,int b,int c)
    {
        return (a+b+c);
    }

    public static void main(String[] args) {
       MO m=new MO();
       m.Test("Anya");
       m.Test(5,5);
       m.Test("ABC",6);
       m.Test(3.14f);

       //Test(2,2,2);//can access without using object of class as this is static method

        System.out.println("Addition of 3 Number is "+Test(2,2,2));
//        OR
//        int add=Test(1,2,3);
//        System.out.println("Addition of 3 Number is "+add);



        System.out.println("-----------");

      String b= m.Test("Print",5);
        System.out.println(b); //will return value of x i.e(print)

    }
}

package src.OOPS_14_JAN_2024;

public class Lab117 {
    public static void main(String[] args) {
       // P01 po1;only class in loaded nothing will print.
        P01 po1=new P01(); //SIB block will call only once as class is loaded only once
        P01 po2=new P01();

        po1.m1();
        P01.m2();//static method called using class name

        P01 po3=null;
       // po3.m1();will get error NullPointerException object is not created.
        System.out.println("\n");
        po3.m2();  //static method get called by class name using ref variable

        //static function are loaded when class are loaded so we can call m2 function




    }
}
    class  P01
    {
        static
        {
            System.out.println("SIB Block");
        }
        {
            System.out.println("IIB Block");
        }
        int a=10; //instance variable
        static int b=20;
        void  m1()
        {
            System.out.println("m1 function");
            System.out.println(a);
            System.out.println(b);
        }

        static  void m2()
        {
         //   System.out.println(a); static function cannot have an instance variavle
            System.out.println(b);
        }


    }


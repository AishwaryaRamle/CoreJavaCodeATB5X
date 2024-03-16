package src.OOPS_14_JAN_2024.Exceptions_class.Throws;

public class Lab141 {
    public static void main(String[] args) throws Exception {
        //extracted(10);
        extracted(0);
        throw new Exception("Hello");  //Main Exception
    }

    private static void extracted(int b) {
//        int a;
//        if (b == 0) {
//            throw new ArithmeticException("B can't be Zero");//Here custom Exception is created at object level by us.
//        } else {
//            a = 10 / b;
//        }
//        System.out.println(a);

        // In Web AUT if something return zero value (e.g. a ==0) -> throw exception and exit the program
//        try {
//            int a=10/b;
//        }
//        catch (Exception e)  //This Exception is handled by JVM.
//        {
//            System.out.println(e.getMessage());
//        }
    }
}


package src.OOPS_14_JAN_2024.Exceptions_class.Throw;
//Throw work at object level and Throws work at method level
public class Lab140 {
    public static void main(String[] args) {

        extracted(0);

    }

    private static void extracted(int b) {
       // int a=10/0;//will show Arithmetic exception error by jvm
       // int a=10/b;
        int a;
      //  int b=0;
        if(b==0)
        {
            throw new ArithmeticException("B can't be zero"); //Here custom Exception is created at object level by us.
        }
        else {
            a=10/b;
        }
        System.out.println(a);
    }
}

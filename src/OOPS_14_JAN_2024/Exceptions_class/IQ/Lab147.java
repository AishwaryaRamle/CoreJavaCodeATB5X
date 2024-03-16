package src.OOPS_14_JAN_2024.Exceptions_class.IQ;

public class Lab147 {
    public static void main(String[] args) throws Exception {//2.option
        H h=new H();
        h.process();

    }
}
class H{
    public int process() throws Exception{ //2.option
      // int a=10/0; // show ArithmeticException Error by jvm.
        //throw  new NullPointerException();
        int a=10/0;  //Exception is handle by line number 11 Exception.

        //if line 12 is commented without return 0 it will show null pointer Exception error
        //if both line 12 and 13 are commented and return 0 will show ArithmeticException Error;
        return 0;
    }


}

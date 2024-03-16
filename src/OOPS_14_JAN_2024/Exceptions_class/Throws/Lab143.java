package src.OOPS_14_JAN_2024.Exceptions_class.Throws;

import javax.print.attribute.standard.OrientationRequested;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab143 {
    public static void main(String[] args) throws Exception {
        eq("a");
    }
    static void eq(String a) throws Exception {

        String s="Hello";
        String s1="hello";
        System.out.println(s.equals(s1));

        // Code 100

        //101
        FileReader f = new FileReader(new File("C://a/txt"));

        boolean result=a.equalsIgnoreCase("A");
        // if (a.equalsIgnoreCase("A"));
        if(result)
        System.out.println(result);
        throw new ArithmeticException();

        // Code 100

//        String myStr1 = "Hello";
//        String myStr2 = "HELLO";
//        String myStr3 = "Another String";
//        System.out.println(myStr1.equalsIgnoreCase(myStr2)); // true
//        System.out.println(myStr1.equalsIgnoreCase(myStr3)); // false
    }
}

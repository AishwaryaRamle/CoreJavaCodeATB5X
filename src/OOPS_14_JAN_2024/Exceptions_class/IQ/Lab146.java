package src.OOPS_14_JAN_2024.Exceptions_class.IQ;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab146 {
    public static void main(String[] args) //2.throws Exception at class/method level.
    {
       try {

            String path = "c/a.txt";
            FileInputStream f = new FileInputStream(path);
        }
        catch (Exception e) // can handle Exception: 1st option through with try catch block
        {
            throw new RuntimeException();
        }
    }
}

package src.OOPS_14_JAN_2024.Exceptions_class.Throws;

import java.io.File;
import java.io.FileReader;

public class Lab144 {
    public static void main(String[] args) {
        int a = 10 / 0;//UnChecked - JVM don't know?
        //Here JVM will show Arithmetic Exception error

        //Checked Exception
        try {

            FileReader f = new FileReader(new File("c://a.txt"));

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}

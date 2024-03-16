package src.OOPS_14_JAN_2024.Exceptions_class;

import java.io.FileInputStream;

public class Lab133 {
    public static void main(String[] args) {
        //Unchecked Exception , Runtime
        //JVM unable to check so it called unchecked Exception or Runtime Exception.

        String name =null;
        name.trim(); // Unchecked? Runtime

        //Checked Exception , Compile Time -/JVM?
        //If JVM Knows about it, - Checked Exception
         try {
             FileInputStream f = new FileInputStream("hddd.txt");
         }
         catch (Exception e)
         {
             System.out.println("FileInputStream Exception");
         }
    }
}

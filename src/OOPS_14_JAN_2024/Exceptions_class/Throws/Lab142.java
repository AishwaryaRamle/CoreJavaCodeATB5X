package src.OOPS_14_JAN_2024.Exceptions_class.Throws;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab142 {
    public static void main(String[] args) throws FileNotFoundException {


readFile("c://a.txt");
        // prone to error


    }
    static void readFile(String Filename) throws FileNotFoundException {
     File f=new File(Filename);
        System.out.println(f);
        FileReader fileReader=new FileReader(f);

        int a=10/10;
        int c=0;
        int a1=10/4;
        if (c==0)
        {
            throw new ArithmeticException();
        }
        int a2=10/1;
        int a3=10/10;
    }
}


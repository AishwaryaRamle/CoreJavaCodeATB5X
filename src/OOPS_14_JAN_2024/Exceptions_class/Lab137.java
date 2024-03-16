package src.OOPS_14_JAN_2024.Exceptions_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab137 {
    public static void main(String[] args) throws FileNotFoundException {
        String path="c://a.txt";
        File file=new File(path);
        System.out.println("Working Directory = " + path);
        FileReader  fileReader=new FileReader(file);
    }
}

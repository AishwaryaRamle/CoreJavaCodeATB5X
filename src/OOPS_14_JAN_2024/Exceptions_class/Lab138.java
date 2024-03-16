package src.OOPS_14_JAN_2024.Exceptions_class;

import java.io.File;
import java.io.FileReader;

public class Lab138 {
    public static void main(String[] args) {
        try{
            //String path = Paths.get("").toAbsolutePath().toString();
            //String path = System.getProperty("user.dir");
        String path="C://a.txt"; //C://Users/hp/Desktop/aa.txt
        File file=new File(path);
        System.out.println("Working Directory = " + path);
        FileReader fileReader=new FileReader(file);
        }
        catch (Exception e)
        {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

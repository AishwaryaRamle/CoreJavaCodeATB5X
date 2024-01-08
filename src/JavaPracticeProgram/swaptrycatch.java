package src.JavaPracticeProgram;

import java.util.Scanner;

public class swaptrycatch {
    public static void main(String[] args) {
        try {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the value of a");
            int a=sc.nextInt();
            System.out.println("Enter the value of b");
            int b=sc.nextInt();


                a = a * b;
                b = a / b;
                a = a / b;

            System.out.println("Value of a--->" + a);
            System.out.println("Value of b--->" + b);
            sc.close();
        }
        catch(Exception e)
        {
            System.out.println("Not Possible with zero");
        }
    }

}

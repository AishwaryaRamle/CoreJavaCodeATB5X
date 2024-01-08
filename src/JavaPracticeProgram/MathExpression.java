package src.JavaPracticeProgram;

import java.util.Scanner;

public class MathExpression {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       // System.out.println("Enter value of num1,num2 and num3");
        System.out.println("Enter the value of num1");
        double num1=sc.nextDouble();
        System.out.println("Enter the value of num2");
        double num2= sc.nextDouble();
        System.out.println("Enter the value of num3");
        double num3=sc.nextDouble();

        double x=num1*num1;
        double y= num2*num2;
        double z=Math.abs(num3);

        double result = x+y-z;
        System.out.println("Value of Expression is "+ Math.cbrt(result));
        System.out.println("The cube root of (x^2 + y^2 + |z|) is:  "+ (Math.cbrt(Math.pow(num1,2)+Math.pow(num2,2)-Math.abs(num3))));

        //scanner stream should be closed after we are done.
        sc.close();

    }
}

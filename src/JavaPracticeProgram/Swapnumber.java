package src.JavaPracticeProgram;

import java.util.Scanner;

public class Swapnumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();

       int temp=a;
        a=b;
        b=temp;
       // System.out.println("Value of a and b after swapping--->"+"val of a "+a+" val of b "+b);

        //swap without using 3rd variable
       /* a=a+b;
        b=a-b;
        a=a-b;

        another way
        a=a*b;
        b=a/b;
        a=a/b;This program will not work if one of the value is zero

        bitwise XOR
        a=a^b;
        b=a^b;
        a=a^b;*/

        System.out.println("Value of a--->"+a);
        System.out.println("Value of b--->"+b);
        sc.close();

    }
}

package src.Basics_03_16Dec;

import java.util.Scanner;

public class Lab040 {
    public static void main(String[] args) {
        // Take two input from user and give max out of two number
        // a,b  a>b -> a, else b
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of a and b ");
        int a =sc.nextInt();
        int b=sc.nextInt();


        if (a > b) {
            System.out.println("Max is " + a);
        } else {
            System.out.println("Max is " + b);
        }

//        if(a>b)
//        {
//            System.out.println(a+" is Highest value between Both Entered Value");
//        }
//        else
//            System.out.println(a +" is Lowest value between Both Entered Value");
        // concatenation - combine two or more things
    }
}

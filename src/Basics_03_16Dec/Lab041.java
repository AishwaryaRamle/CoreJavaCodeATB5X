package src.Basics_03_16Dec;

import java.util.Scanner;

public class Lab041 {
    public static void main(String[] args) {
        // Take two input from user and give max out of two number
        // a,b  a>b -> a, else b
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of a and b ");
        int a = sc.nextInt();
        int b = sc.nextInt();


        if (a > b) {
            System.out.println("Max is " + a + " Min is " + b);
        } else {
            System.out.println("Max is " + b + " Min is " + a);

        }
    }
}

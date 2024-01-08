package src.JavaPracticeProgram;

import java.util.Scanner;

public class Fact2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number to find Factorial of given number!!!");
        int num =sc.nextInt();
        long fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("Fact -> "+ fact);
        System.out.printf("Factorial of %d = %d", num, fact);
        sc.close();
    }
}


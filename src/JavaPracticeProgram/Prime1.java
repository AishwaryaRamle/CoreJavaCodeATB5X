package src.JavaPracticeProgram;

import java.util.Scanner;

public class Prime1 {
    public static void main(String[] args) {
        //Prime Number Condition num%i(i-->2 to number)==0---->x is not prime else prime
        int i=0;
        int flag=0;
        int m;

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your number");
        int n = sc.nextInt();
        m=n/2;
        if(n==0 || n==1)
        {
            System.out.println(n+" "+ "Number is not a Prime Number");
        }
        else
        {
            for ( i = 2; i <=m ; i++) {
                if(n%i==0)
                {
                    System.out.println(n+" "+ "Number is not a Prime Number");
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0)
        {
            System.out.println(n + "Number is Prime Number");
        }


    }
}

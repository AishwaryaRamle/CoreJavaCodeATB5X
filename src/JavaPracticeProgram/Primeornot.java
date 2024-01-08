package src.JavaPracticeProgram;

import java.util.Scanner;

public class Primeornot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i=2;
        boolean flag = false;

        // Loop to check for divisors from 2 to num/2
        while(i<num/2)
        {
                // Condition for nonprime number
                if (num % i == 0) {
                    flag = true;
                    break;
                }
               ++i;
            }
            // Output based on the flag value
            if (!flag)

                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
            sc.close();

        }

    }






package src.Basics_05;

import java.util.Scanner;

public class Lab078 {
    public static void main(String[] args) {
        // Sum of Digit = 5+4+3+2+1


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        long fact = 0;

        int i=1;
//        while(i<=number){
//            fact = fact*i;
//            i++;
//        }
//        System.out.println("Fact -> "+ fact);


        for (int j = 1; j <= number ; j++) {
            fact = fact+j;
        }
        System.out.println("Fact -> "+ fact);
        sc.close();


    }
}

package src.Basics_05;

import java.util.Scanner;

public class Leap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int year =sc.nextInt();

        // divisible by 4, not by 100, or divisible by 400
//        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
//            System.out.println(year + " is a leap year.");
//        } else {
//            System.out.println(year + " is not a leap year.");
//        }

        if(year%100==0 && year %400==0 || year%100!=0 && year%4==0){
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }
}

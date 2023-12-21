package src.Basics_04_17Dec;

import java.util.Scanner;

public class Lab044 {
    public static void main(String[] args) {
        // If, Switch -  Condition Based
        // Loops -> Which will repeat something - for, while, do while

        // Switch - Condition based - Multiple Condition


        // Which day is today!!
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1-7, I will tell which day it is");
        // 1 ->  Monday, 7 -> Sunday,  MTWTFSS , invalid -> 99 - are you mad?
        int dayNumber =sc.nextInt();

        switch(dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            default:
                System.out.println("ARE YOU MAD!!!");
                break;// This break optional if default is last option
        }
        System.out.println("End Of Program");
    }
}

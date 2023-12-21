package src.Basics_04_17Dec;

import java.util.Scanner;

public class Lab042 {
    public static void main(String[] args) {
        // If else
        //  Yes, No
//        if(true){
//            System.out.println("True");
//        }
//        else{
//            System.out.println("False");
//        }
//
//
//        if(true){
//            System.out.println("Only If");
//        }


        // What If  - Number -> > 20, < 20 , < 10 ->

        // If, else if , else

        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();

        if(num>20)
        {
            System.out.println("Number is Greater than 20");
        } else if (num>10) {
            System.out.println("Number is Greater than 10");
        }
        else
        {
            System.out.println("Number is less than 10");
        }
    }

}

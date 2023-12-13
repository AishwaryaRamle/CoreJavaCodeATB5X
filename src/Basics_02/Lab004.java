package src.Basics_02;

import java.util.Arrays;

public class Lab004 {
    public static void main(String[] args) {
        /*//Showcase difference between println vs print vs printf
        System.out.println("9*1=9");
        System.out.println("table");
        System.out.print("Testing");*/

        int age=30;
        final String name = "Testing";
        //%d --> any integer,short,byte or long
        //%c --> any character.
        //%s --> String
        //%f --> float

//        name= "Manual"; value cant change for string name because final is already declared.
//        System.out.println(name);

        //concate + operation
        //System.out.println("Your Name is "+ name + " your Age is " + age);

        System.out.printf("Your Age is %d and Your Name is %s",age,name);// use for formatting

        System.out.println();
        final float pi =3.14159f;
        System.out.printf("Value of pi is %f",pi);

//        float pi=3.189; value cant change because float is declared as final.
//      System.out.println("Value of Pi is " + pi);

        System.out.println();
        int number =5;
        System.out.printf("%d*1=%d",number,number);
        System.out.println();

    }
}

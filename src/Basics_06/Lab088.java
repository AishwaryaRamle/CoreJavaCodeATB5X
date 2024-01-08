package src.Basics_06;

import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {
        //Take input user Marks of 5 subjects and Print the marks
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter the First subject marks");
        marks[0] = sc.nextFloat();
        System.out.println("Enter the second subject marks");
        marks[1] = sc.nextFloat();
        System.out.println("Enter the Third subject marks");
        marks[2] = sc.nextFloat();
        System.out.println("Enter the Fourth subject marks");
        marks[3] = sc.nextFloat();
        System.out.println("Enter the Fifth subject marks");
        marks[4] = sc.nextFloat();
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 30) {
                System.out.println("You are fail in this subject " + marks[i]);
            } else {
                System.out.println(marks[i]);
            }
            sc.close();
        }
    }
}

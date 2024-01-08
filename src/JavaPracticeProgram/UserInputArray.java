package src.JavaPracticeProgram;

import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] int_array = new int[n];

        System.out.println("Enter the array Elements");
        for (int i = 0; i < n; i++) {
            int_array[i] = sc.nextInt();
        }
        System.out.println("--Output---");
        for (int i = 0; i < n; i++) {
            System.out.println(int_array[i]);
        }
        sc.close();
    }
}

package src.JavaPracticeProgram;

import java.util.Scanner;

public class palindrome2 {
    public static void main(String[] args) {
        String original,reverse=""; // Objects of String class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = in.nextLine();

        int length=original.length();

        for (int i = 0; i <=length-1 ; i++) {
            reverse= original.charAt(i)+reverse;
        }
        System.out.println("Reverse of string is "+reverse);
        if(original.equalsIgnoreCase(reverse))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }

}

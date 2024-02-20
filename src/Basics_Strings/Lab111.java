package src.Basics_Strings;

import java.util.Scanner;

public class Lab111 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String, I will check for Palindrome");
        String user_input = sc.next();
       // user_input = user_input.toLowerCase();
        boolean result = ispalindrome(user_input);
        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

        static boolean ispalindrome (String userInput){
            String original_string= userInput;
            StringBuilder sb=new StringBuilder(userInput);
            String reverse_string=sb.reverse().toString();
            return original_string.equalsIgnoreCase(reverse_string);

        }
    }

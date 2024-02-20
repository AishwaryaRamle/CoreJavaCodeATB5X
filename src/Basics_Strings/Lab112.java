package src.Basics_Strings;

import java.util.Scanner;

public class Lab112 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String, I will check for Palindrome");
        String user_input = scanner.next();
//        user_input = user_input.toLowerCase();
        boolean result = isPalindrome(user_input); // boolean result = isPalindrome("Naman");
        if(result){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }

    }

    static boolean isPalindrome(String userInput) {
        String original_str = userInput; //Pramod , naman
        StringBuilder sb = new StringBuilder(userInput);
        String reverse_string = sb.reverse().toString(); // domarP , naman
        return original_str.equalsIgnoreCase(reverse_string); // domarp == Pramod , true
    }
}


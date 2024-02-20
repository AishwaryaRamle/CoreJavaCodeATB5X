package src.JavaPracticeProgram;

import java.util.Scanner;

public class Pal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String ");
        String user_input=sc.next();
        user_input=user_input.toLowerCase();
        StringBuilder sb=new StringBuilder(user_input);
        String rev=sb.reverse().toString();
        System.out.println(rev);
        if(user_input.equals(rev)) //  if(original.equalsIgnoreCase(reverse))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}

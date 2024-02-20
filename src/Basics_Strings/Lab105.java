package src.Basics_Strings;

import java.util.Locale;

public class Lab105 {
    public static void main(String[] args) {
        String one = "Hello";
        System.out.println(one.concat(" World"));
        System.out.println(one + " World");
        System.out.println(one.contains("o"));
        System.out.println(one);

        String two = new String("Aishwarya");
        String expected_result = "password@123";
        String actual_result = "Password@123";
        //System.out.println(expected_result.equalsIgnoreCase(actual_result));
        //System.out.println(expected_result.toLowerCase());

        if (actual_result.toLowerCase().equals(expected_result))// with == it check for reference value and .equal check for content equality
        {
            System.out.println("Expected result and Actual Result are same");
        }

        if (expected_result.equalsIgnoreCase(actual_result)) {
            System.out.println("Yes");
        }
    }
}

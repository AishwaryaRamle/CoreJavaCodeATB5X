package src.Basics_03_16Dec;

public class Lab027 {
    public static void main(String[] args) {
        // variable declaration
        int c=20;
        int d=40;
        int max;
        System.out.println("First num: " + c);
        System.out.println("Second num: " + d);

        // Largest among c and d
        max=(d>c) ? d:c;

        // Print the largest number
        System.out.println("Maximum Number is "+ max);

        int a=true?10:20;
        int b=false?10:20;
        System.out.println(a);
        System.out.println(b);


    }
}

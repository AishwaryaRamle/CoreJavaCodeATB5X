package src.Basics_05;

import java.util.Scanner;

public class Lab054 {
    public static void main(String[] args) {
        // Take a user input and print the information

        Scanner user_input =new Scanner(System.in);
        System.out.println("Enter your name");
        String name =user_input.next(); //can read only input till the space
       // String name =user_input.nextLine(); //will take input till press enter or \n or can read input including space between two words

        System.out.println("Enter your age");
        int age = user_input.nextInt();

        System.out.println("Enter your salary");
        double salary =user_input.nextDouble();

        //System.out.println("Your details are :"+"\n"+"Name is: "+name +"\n"+"Age is:" +age+"\n"+"Salary is :"+salary);
        System.out.println("Your details are " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your Salary is " + salary);

        user_input.close();

    }
}

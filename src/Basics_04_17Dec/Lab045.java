package src.Basics_04_17Dec;

import java.util.Scanner;

public class Lab045 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter browser Name chrome, firefox, edge, opera");
        String browser =sc.nextLine();

        switch (browser.toLowerCase())
        {
            case "chrome":
                System.out.println("Execute the chrome code");
                break;
            case "firefox":
                System.out.println("Execute the FireFox Code");
                break;
            case "edge":
                System.out.println("Execute the edge code");
                break;
            default:
                System.out.println("I have not idea which browser is this");

        }



    }
}

package src.OOPS_07jan2024;

import java.util.Scanner;

public class Lab105 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Person p=new Person();
        p.PrintDetails();
        //new Person(); Here also DC is called
       // Person p1; Here also DC is called as object is not created.
        System.out.println("-----------");


        System.out.println("Enter the username ");
        String username=sc.next();
        Person p2=new Person(username);
        p2.PrintDetails();

        System.out.println("-----------");

        System.out.println("Enter the username2");
        String username2=sc.next();

        Person p3=new Person(username2);
        p3.PrintDetails();
        p3.printDetail(5);

        // this ->

        // p3 -> name -> Amit -> this -> p3
        // p2 -> name -> Pramod -> this -> p2
        // p ->  name -> null -> this -> nothing


        sc.close();

    }
}

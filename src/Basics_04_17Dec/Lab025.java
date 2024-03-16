package src.Basics_04_17Dec;

import java.util.Scanner;

public class Lab025 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i = sc.nextInt();
        double j= sc.nextDouble();
        String k=sc.nextLine();
        //if entering input value of the string in the same line s.nextLine() will work else have to use s.next();

        //next() can read only input till the space.
        //nextLine() can read including space between two words.

       // String k=sc.next();  HERE ACCEPT STRING
        System.out.println("String:"+k);
        System.out.println("Double:"+j);
        System.out.println("Int:"+i);
    }
}

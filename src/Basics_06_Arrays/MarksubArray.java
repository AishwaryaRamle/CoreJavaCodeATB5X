package src.Basics_06_Arrays;

import java.util.Scanner;
public class MarksubArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks of 10th");
        int marks[]=new int[6];
       /* marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        marks[3]=sc.nextInt();
        marks[4]=sc.nextInt();
        marks[5]=sc.nextInt();
       */

        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        String sub[]={"Hindi","eng","math","physics","chemistry"};
        for(int i= 0; i<marks.length && i< sub.length;i++)
        {
            System.out.println(sub[i]+" "+ "marks  "+marks[i]);
        }

    }
}
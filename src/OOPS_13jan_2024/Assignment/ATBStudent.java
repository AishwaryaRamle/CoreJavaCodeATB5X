package src.OOPS_13jan_2024.Assignment;

import java.util.Arrays;

public class ATBStudent {
    public static void main(String[] args) {
        ATB[] atb5students;
        atb5students=new ATB[5];
        atb5students[0]=new ATB(1,"Aishwarya");
        atb5students[1]=new ATB(2,"Spruha");
        atb5students[2]=new ATB(3,"Anya");
        atb5students[3]=new ATB(4,"Rani");
        atb5students[4]=new ATB(5,"Ameya");
        //String a= atb5students[0].toString();
       // System.out.println(a);
        System.out.println(atb5students[0].toString());
        System.out.println(atb5students[1].toString());
        System.out.println(atb5students[2].toString());
        System.out.println(atb5students[3].toString());
        System.out.println(atb5students[4].toString());


    }
}


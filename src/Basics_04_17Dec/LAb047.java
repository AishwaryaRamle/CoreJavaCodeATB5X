package src.Basics_04_17Dec;

import java.util.Scanner;

public class LAb047
{
    public static void main(String[] args) {

        //        int a=30;
//        switch(a){ }

//        char ch = 'A'; // 65
//        switch (ch) {
//        }

//        float f = 30.0F;
//        switch ((int) f) {
//        }

//                double d=30.0;
//        switch(d){ }


//        boolean b = true;
//        switch(b ){ }
//
//        long a11=30;
//        switch((int)a11){ }

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Value");
        float f =sc.nextFloat();

       //float f=24.45f;
      switch ((int)f)
     {
        case 14:
        {
            System.out.println("number is 14");
        }
        break;
        case 20:
        {
            System.out.println(20);
        }
        break;
        default:
            System.out.println("Default value");


    }

    }
}


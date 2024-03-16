package src.OOPS_14_JAN_2024.Exceptions_class;

public class Lab132 {
    public static void main(String[] args) {
        //Edit and save value in command line argument
        String sh=args[0]; // 1 //5,15 -> String-> java.lang.ArrayIndexOutOfBoundsException

        //Convert String into Primitive integer
        int x=Integer.parseInt(sh);//2 ->  java.lang.NumberFormatException prmaod-> int?

        int a=10/x;// 3 - java.lang.ArithmeticException

        System.out.println(x);
        System.out.println(a);

    }
}

//Exception will occur when pass value such as string,o and no value in CLA, and this exception are thrown by JVM

//JVM will be Initialized
//Creates and Starts the main Thread.


//main Thread will do the following tasks
//1)Collects the Command Line Arguments
//2)Creates the String array with CLA(command line Argument)
//3)Calls main method by passing String array as Parameter:
//Lab32.main(5,15);
//Now Control will be transferred from main Thread to main method

//Control will come back to main thread in two ways.
//A)When problem comes in main -> JVM
// Creates the Object of Identified Exception class.
//Exception a=new Exception()
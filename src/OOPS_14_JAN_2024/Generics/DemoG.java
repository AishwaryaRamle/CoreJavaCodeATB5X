package src.OOPS_14_JAN_2024.Generics;

public class DemoG {
    //function is Generic
    public static <T> void temp(T a)//T--stands for generic datatype, for making generic need to specify <>Diamond operator
    {
        System.out.println(a);

    }

    public static void main(String[] args) {
        temp(1);   //we can add any type of value in this method is temp method is generic in nature.
        temp(12.45);
        temp('a');
        temp("Aishwarya");

    }
}

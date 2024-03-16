package src.OOPS_14_JAN_2024.Wrapperclass;

public class Lab129 {
    public static void main(String[] args) {
        int x=23;
        //String st1= x;-->not possible,string cannot be assigned to integer
        //String st1=(String)x;---->Downcasting not possible

        String st1=x+""; //with concatenation operator it is possible
        System.out.println(st1);

        String s1=String.valueOf(x); //instead of concatenation operation we can use String wrapper class function.
        System.out.println(s1);



    }
}

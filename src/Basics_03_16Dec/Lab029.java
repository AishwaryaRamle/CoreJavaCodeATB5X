package src.Basics_03_16Dec;

public class Lab029 {
    public static void main(String[] args) {
        // Ternary operator.

        //int a =  condition ?  if this is true print do this :  If false do this

        // MAX in two number?
        int a=30;
        int b=40;
        int c=52;

        //if a>b && a>c -->a
        //(a>c)?a:c
        //(b>c)?b:c

        int max =(a>b) ?(a>c?a:c):(b>c ? b:c);
        System.out.println(max);
    }
}

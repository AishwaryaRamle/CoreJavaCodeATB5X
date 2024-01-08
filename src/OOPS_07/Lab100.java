package src.OOPS_07;

public class Lab100 {
    public static void main(String[] args) {
        String c=main("Manual");
        System.out.println(c);
        print("Test");


    }
    static String main(String s)
    {
        System.out.println("Return with param");
        return s+"Testing";
    }
    static void print(String s)
    {
        System.out.println("Non Return with param");
        System.out.println(s);
    }
}


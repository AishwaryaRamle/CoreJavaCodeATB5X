package src.OOPS_07;

public class Lab094 {
    public static void printjava()
    {
        System.out.println("Hello Java");
    }
    public static void printName(String name)
    {
        System.out.println(name);
    }
    public static void printsum(int a,int b)
    {
        int c= a+b;
        System.out.println(c);
    }


    public static void main(String[] args) {
        printjava();
        printjava();
        printName("Aishwarya");
        printsum(15,20);
    }
}

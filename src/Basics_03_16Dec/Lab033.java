package src.Basics_03_16Dec;

public class Lab033 {
    public static void main(String[] args) {
        int b=10;
        System.out.println(++b +b++);
        System.out.println(b);

        // A ++b -->11 b=11
        // B b++ -->11 b=12
        // A+B -->22   b=12
    }
}

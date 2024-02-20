package src.OOPS_13jan_2024.Polymorphism;
class P04 {
    int a;
    static int b;
    static void run2() {
        System.out.println("Hahah");
    }
    void run() {
    }
}
public class IV4 {
    public static void main(String[] args) {
        //System.out.println(P04.a); called with class name . variable name
        System.out.println(P04.b);
        P04.run2();
        System.out.println();
        //System.out.println(P04.run());
    }
}


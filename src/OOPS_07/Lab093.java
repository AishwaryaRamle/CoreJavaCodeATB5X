package src.OOPS_07;

public class Lab093 {
    static int sum(int a, int b) { // Definition of the Function
        return a + b;
    }

    static int sum(int a) {
        return a;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static int sum() {
        return 99;
    }



static  void sayHello()
{
    System.out.println("Hello");
}

    public static void main(String[] args) {
        int c=sum(5,5);// 2 arguments
        int c1=sum(5);//1 argument
        int c2=sum(5,5,5);
        int c3=sum();

    System.out.println(c);
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);

    sayHello(); //call to function

    }
}

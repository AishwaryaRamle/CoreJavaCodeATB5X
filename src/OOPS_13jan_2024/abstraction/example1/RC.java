package src.OOPS_13jan_2024.abstraction.example1;

public class RC {
    public static void main(String[] args) {
        System.out.println(Math.pow(3,2));
        Daughter d=new Daughter();
        d.bhk3();
        d.loan5CR();
        d.loan100CRGranF();
        d.lottery500CR();
        System.out.println("\n");

        Son1 s1=new Son1();
        s1.bhk3();
        s1.loan5CR();
        s1.loan100CRGranF();
        s1.lottery500CR();

        System.out.println("\n");

        Son2 s2=new Son2();
        s2.bhk3();
        s2.loan5CR();
        s2.loan100CRGranF();
        s2.lottery500CR();


    }
}

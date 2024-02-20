package src.OOPS_13jan_2024.Polymorphism;

class P03 {
    int a;
}

public class IV3 {
    public static void main(String[] args) {
        P03 h=null;//object not created h=null
        P03 h2=new P03();
        // System.out.println(h.a);NullPointerException
        System.out.println(h2.a);//0
    }
}


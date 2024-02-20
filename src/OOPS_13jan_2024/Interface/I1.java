package src.OOPS_13jan_2024.Interface;

public class I1 {
    public static void main(String[] args) {
       // new A1(); No Object can be created of interface.
        System.out.println(A1.a);

    }
}

interface A1{
    int a=10; //By default  variable in interface are final variable and static variable

}


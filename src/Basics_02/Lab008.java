package src.Basics_02;

public class Lab008 {
    public static void main(String[] args) {
        //Assignment operator
        int a=50;
        System.out.println("Assignment operator output==>" + a);

        //Arithmetic operator -- Binary
        // +,-,/,*, %
        int num1 = 67;
        int num2 = 89;
        System.out.println(num2 + num1);

        String FirstName ="Hello";
        String Lastname="World";
        System.out.println("Name is "+ FirstName +" " + Lastname);

        // Unary
        int a1=10;
        int a2 =20;
        // // Printing the above variable
        System.out.println(a1);
        System.out.println(a2);
        // Performing unary operation
        //e.g.a1=10 OR a1=+10
        a1=+a1; //a1=+10
        a2=-a2; //a2=-10
        System.out.println(a1);
        System.out.println(a2);

// INCREMENTAL OPERATOR
        /*int a3=++a;
        System.out.println(a3);
        a3=--a;
        System.out.println(a3);*/

        int a3=a++;
        System.out.println(a3);
        a3=a--;
        System.out.println(a3);

        /*int i=10;
        System.out.println(i);
        ++i;
        System.out.println(i);
        i++;
        System.out.println(i);
        --i;
        System.out.println(i);
        i--;
        System.out.println(i);*/
    }
}

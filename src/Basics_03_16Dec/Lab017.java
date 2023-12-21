package src.Basics_03_16Dec;

public class Lab017
{
    public static void main(String[] args) {
        // Casting - Mold
        //  Widening is the process of converting lower type to higher type. This is safe conversion.

        byte b = 10;
        int a =  b; // Implicit Casting - JVM
        int c = (int) b; // Explicit Casting - JVM

        System.out.println(a);


        // Narrowing is the process of converting higher type to lower type.
        int a1 = 300;
        // byte b1 = a1; // Invalid - Implicit Casting
        byte b1 = (byte)a1; // EXPLICIT casting
        System.out.println(b1);


        short s=138;
        int impconv =s;
        System.out.println("Implicit Widening conversion from short to int" + " " +impconv);
        int expconv =(int)impconv;
        System.out.println("Explicit Widening conversion from short to int" + " " +expconv);

        double d=45.892;
        //int i =d;//Implicit narrowing conversion not allowed.
        int i=(int)d; //Explicit narrowing conversion
        System.out.println("Explicit Narrowing conversion from short to int" + " " +i);

        int p=400;
        byte q=(byte)p;
        System.out.println(q);




    }
}

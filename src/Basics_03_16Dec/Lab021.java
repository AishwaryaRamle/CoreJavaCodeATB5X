package src.Basics_03_16Dec;

public class Lab021 {
    public static void main(String[] args) {
        byte a=10;
        int b=a;// Valid Implicit conversion.
        int b1=(int)a;// Valid Explicit conversion
        System.out.println(b);


        int a2=300;
        byte b2=(byte)a2; //Explicit Conversion
        System.out.println(b2);

        // 32 Bits
        // 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1
        // will be sorted into the b
        // 0 0 1 0 1 1 0 0
//        0 * 27 + 0 * 26 + 1 * 25 + 0 * 24 + 1 * 23 + 1 * 22 + 0 * 21 + 0 * 20
//        0 + 0 + 32 + 0 + 8 + 4 + 0 + 0
        //44


    }
}

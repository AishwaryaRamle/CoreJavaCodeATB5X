package src.OOPS_07;

public class Lab096 {
    public static void main(String[] args) {
        // Create a Function
        // Argument or Parameter
        // Name of the function
        // Access Type
        // Return Type

        // sum -> 2 , return int, sum, public

        float d = sum(3.5f, 4.5f);
        System.out.println(d);

        double p= Math.pow(2,5);
        System.out.println(p);

    }

    public static float sum(float val1, float val2) {
        return val1 + val2;
    }

    public static double mathpow(double a, double b) {
        return Math.pow(a,b);

    }

}

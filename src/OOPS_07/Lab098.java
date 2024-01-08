package src.OOPS_07;

public class Lab098 {
    public static void main(String[] ref_name) { //args can be written as anything e.g test
        System.out.println("Run fine!!");
        int d= main(10);
        System.out.println(d);
        main("Testing");

    }

    static void main(String name) {
        System.out.println("I am a Main function but JVM doesn't recognize me");
    }

    static int main(int a) {
        return a + 101;
    }
}

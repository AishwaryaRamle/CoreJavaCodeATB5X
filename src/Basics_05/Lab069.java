package src.Basics_05;

public class Lab069 {
    public static void main(String[] args) {
        // Continue -?  If this tru -> continue
        for (int i = 0; i < 10; i++) { // 10 Times, i -> 0 to 9
            System.out.println(i);
            if (i == 5) continue;
            System.out.println("*AFTER*");// after i got initialized to 5 this print statement will not get print.
        }
    }
}

package src.Basics_05;

public class Lab066 {
    public static void main(String[] args) {
        // Print the Odd number in between the 1 to 50.
        for (int i = 1; i <=50 ; i++) {
            if(i%2==0) // !(i%2==1) OR (i%2==0)
            {
                System.out.println(i+" "+ "is Even!");
            }
//            else
//            {
//                System.out.println(i+" "+ "is odd!");
//            }

        }
        System.out.println("-----End of program------");
    }
}

package src.Basics_Strings;

public class Lab110 {
    public static void main(String[] args) {
        // If something is Thread Safe, we avoid!
        // StringBuffer vs StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Pramod");
        stringBuilder.reverse();
        System.out.println(stringBuilder);

    }
}

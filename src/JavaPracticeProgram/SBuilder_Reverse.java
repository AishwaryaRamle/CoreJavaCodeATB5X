package src.JavaPracticeProgram;

public class SBuilder_Reverse {
    public static void main(String[] args) {
        // If something is Thread Safe, we avoid!
        // StringBuffer vs StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Pramod");
        stringBuilder.reverse();
        System.out.println(stringBuilder);

    }
}

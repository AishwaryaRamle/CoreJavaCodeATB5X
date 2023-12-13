package src.Basics_02;

public class Lab007 {
    public static void main(String[] args) {
        char c = '\n'; // New line / Next Line
        char c1 = '\t'; // Add Tab
        char c2 = '\b'; // Backlash, delete 1 char
        char c3 = '\r'; // Backlash, delete 1 word

        System.out.println("Aishwarya" + c +"Ramle");
       //System.out.printf("Aiswarya%cRamle",c);

        System.out.println("Automation\tTesting");
       //System.out.printf("Automation%cTesting",c1);


        //System.out.println("Manual\bTesting");
        System.out.printf("Testing%cABC",c2);
        System.out.println();
      // System.out.println("Manual"+c3+"Testing");
        System.out.printf("Practicing%CJAVA BASIC",c3);




    }
}

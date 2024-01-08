package src.Basics_05;

public class Lab057 {
    public static void main(String[] args) {

        // for( A ;B ; C)
        // A -> Initialization -> JVM What variable, where you are starting point
        // B - Condition -> When you want this to stop.
        // C ->  Increment / Decrement

        for (int i=0;i<10;i++)
        {
            System.out.println("value of i--->" + i);
        }
        //System.exit(-1); // is a way to forcefully terminate the Java Virtual Machine

        System.out.println("------from higher to lower value--------");

        for (int i = 10; i >0 ; i--) {
            System.out.println("value of i--->" + i);
        }

        // // Exit Code - 0 Normal,
        // 1 Force Exit, 130-137 You do it - User interrupted
    }
}

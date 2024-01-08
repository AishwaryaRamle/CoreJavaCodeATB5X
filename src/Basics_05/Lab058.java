package src.Basics_05;

public class Lab058 {
    public static void main(String[] args) {
        // for( A ;B ; C)
        // A -> Initialization -> JVM What variable, where you are starting point
        // B - Condition -> When you want this to stop. -> true, false
        // C ->  Increment / Decrement

        // ICID ->
//        for ( ; ;) //this loop run infinite...
//        {
//            System.out.println("TTA");
//        }

//        boolean b1=true;
//        b1=false;
//        for (;b1;)
//        {
//            System.out.println("TTA");
//        }

        final boolean b1=true;
        //b1=flase;
        for (float f=0;b1;) //run infinite as b1 value is true...
        {
            System.out.println("TTA");
        }

    }
}

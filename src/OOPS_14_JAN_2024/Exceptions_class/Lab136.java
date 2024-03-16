package src.OOPS_14_JAN_2024.Exceptions_class;

public class Lab136 {
    public static void main(String[] args) {
        try{
            int a=0;
            int x=10/a;
        }
        catch (Exception e)
        {
           //e.printStackTrace();
            System.out.println("Exit");
           // System.exit(0);// JVM to stop
        }finally {
            System.out.println("I am Final");
        }
    }
}

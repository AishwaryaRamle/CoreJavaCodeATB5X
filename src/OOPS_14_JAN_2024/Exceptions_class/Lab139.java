package src.OOPS_14_JAN_2024.Exceptions_class;

public class Lab139 {
    public static void main(String[] args) {
     exracted2();
        System.out.println("MAIN Execute");
    }
    private static void exracted2()
    {
        extracted1();
        System.out.println("extracted2 Execute");
    }
    private static void extracted1() {
        extracted();
        System.out.println("extracted1 Execute");
    }
    private static void extracted()
    {
        try {
            String name = null;
            name.length();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

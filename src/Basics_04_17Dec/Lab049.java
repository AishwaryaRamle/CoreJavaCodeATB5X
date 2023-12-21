package src.Basics_04_17Dec;

public class Lab049 {
    public static void main(String[] args) {
        //JDK 13
        int itemcode=005;
        switch(itemcode)
        {
            case 001,002,003:
                System.out.println("It's an electronic gadget!");
                break;
            case 004, 005:
                System.out.println("It's a mechanical device!");
                break;
            default:
                System.out.println("It's a software product!");
        }



    }
}

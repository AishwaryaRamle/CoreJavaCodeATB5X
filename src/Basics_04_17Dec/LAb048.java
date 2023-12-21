package src.Basics_04_17Dec;

public class LAb048 {
    public static void main(String[] args) {
        byte b=10;
        switch(b)
        {
            case 10:
                System.out.println("TEN");
                break;
            case 127:
                System.out.println("ONE TWENTY SEVEN");
                break;
            default:
                System.out.println("DEFAULT");
        }
    }
}

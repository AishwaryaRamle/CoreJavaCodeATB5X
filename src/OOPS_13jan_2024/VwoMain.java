package src.OOPS_13jan_2024;

public class VwoMain {
    public static void main(String[] args) {
        Vwo v=new Vwo("admin","admin");
        boolean b1=v.isLoggedIn("admin","admin");
        System.out.println(b1);

    }
}

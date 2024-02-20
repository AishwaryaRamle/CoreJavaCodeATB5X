package src.OOPS_13jan_2024.AcessModifier.AMDefault;

public class NoRelation {
    public static void main(String[] args) {
        DefaultChild d= new DefaultChild();
        d.Method();//Can call default method from same package and non-subclass
        System.out.println("\n");
        Default d1= new Default();
        d1.Method();//Can call default method from same package and non-subclass
    }
}

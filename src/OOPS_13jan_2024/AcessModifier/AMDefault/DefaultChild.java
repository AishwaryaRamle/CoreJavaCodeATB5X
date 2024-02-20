package src.OOPS_13jan_2024.AcessModifier.AMDefault;

public class DefaultChild extends Default {

    //child class extends parent where default variable/method is present
    public static void main(String[] args) {
        DefaultChild obj = new DefaultChild();
        System.out.println("I am from Child Public calling the default method from parent");
        obj.Method();//Can call default methods from same package subclass
    }
}

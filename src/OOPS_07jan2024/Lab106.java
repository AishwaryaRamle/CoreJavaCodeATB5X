package src.OOPS_07jan2024;

public class Lab106 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.bark();
        System.out.println("-----");
        d.dogDetails();

        System.out.println("-----");
        Dog d1= new Dog("buddy","Golden Retriever");
        d1.dogDetails();

        System.out.println("-----");
        Dog d2= new Dog("charlie","Bulldog");
        d2.dogDetails();

    }
}

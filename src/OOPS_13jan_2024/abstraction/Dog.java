package src.OOPS_13jan_2024.abstraction;

public class Dog extends Animal{
    @Override
    void m2() {
        System.out.println("Abstracted from Animal class");
    }
}
class Test
{
    public static void main(String[] args) {
        Dog d=new Dog();
        new Dog().m2(); //o/p show default constructor twice one for line number 12 and other for line number 13
        //d.m2();
    }
}

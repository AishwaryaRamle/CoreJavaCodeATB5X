package src.OOPS_13jan_2024.Super;

public class TestSuper2 {
    public static void main(String[] args) {
        // 2) super can be used to invoke parent class method
        Dog2 dd = new Dog2();
        dd.eat();
        dd.bark();
        dd.work();

    }
}


    class Animal2 {
        void eat() {
            System.out.println("Eating");
        }

    }
    class Dog2 extends Animal2 {
        void eat() {
            System.out.println("eating bread...");
        }

        void bark() {
            System.out.println("barking...");
        }

        void work() {
            super.eat();
           // bark();
        }
    }


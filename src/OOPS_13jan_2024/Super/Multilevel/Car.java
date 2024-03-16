package src.OOPS_13jan_2024.Super.Multilevel;

public class Car extends Vehicle {
    Car(int speed) {
        super(speed);
    }

    void topSpeed() {
        System.out.println("Top speed in car!");
    }
}

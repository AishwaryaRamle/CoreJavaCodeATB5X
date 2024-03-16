package src.OOPS_13jan_2024.Super.Multilevel;

public class RC {
    public static void main(String[] args) {

        Tesla t = new Tesla(300);
        t.topSpeed();

        Car c = new Car(250);
        c.topSpeed();

        Vehicle v = new Vehicle(150);
        v.topSpeed();


    }
}

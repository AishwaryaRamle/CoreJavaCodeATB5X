package src.OOPS_13jan_2024.Super.Multilevel;

public class Vehicle {
    //  Vehicle -> Car ->  Tesla
    // Multi Level - G,F,S

    int seats;
    String engineType;
    int speed;

    Vehicle(int speed) {
        this.speed = speed;
    }

    void topSpeed(){
        System.out.println("Top speed is " + this.speed);
    }

}

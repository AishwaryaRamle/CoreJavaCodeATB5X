package src.OOPS_14_JAN_2024.InnerClass;

import src.OOPS_13jan_2024.Interface.RealTimeExample.Engine;

public class Lab121 {
    public static void main(String[] args) {
        Car c=new Car("Lambo 137");
        c.drive();
        Car.Engine en=c.new Engine("40");
        en.start();
        c.drive();
        // OC.IC ref = OCRef.new IC();  can create inner object with reference of outer class

    }



}

class Car{
    String make;//Instance Variable

    // Parameterimized Constructor
    Car(String make)
    {
        this.make=make;
    }
    void drive()
    {
        System.out.println("You can drive car");
    }
    public class Engine{
        // Instance Variables
        String horsePower;

        // Parameterized Construct
        public Engine(String horsePower) {
            this.horsePower = horsePower;
        }
        // Method
        void start(){
            System.out.println("Engine is started!! -> " + "\n" +"HoursePower of Engine is: "+horsePower+ " and make is: "+ make);
        }

    }
   // public class Break{}
}

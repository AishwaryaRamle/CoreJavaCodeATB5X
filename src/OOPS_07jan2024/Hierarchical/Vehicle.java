package src.OOPS_07jan2024.Hierarchical;

public class Vehicle {
    Vehicle()
    {
        System.out.println("Vehicle DC");
    }
    void vehicleHasTopSpeed()
    {
        System.out.println("yeah from "+getClass().getSimpleName());
    }
}

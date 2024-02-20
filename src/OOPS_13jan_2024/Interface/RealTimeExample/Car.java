package src.OOPS_13jan_2024.Interface.RealTimeExample;

public class Car implements Engine,Break{

    void start()
    {
        System.out.println( "Starting the Car");
        startEngine();
    }
    @Override
    public void startEngine() {
        System.out.println("Started Engine");
    }

    @Override
    public void breaks() {
        System.out.println("break is working fine");
    }
}

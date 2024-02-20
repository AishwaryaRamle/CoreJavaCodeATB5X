package src.OOPS_13jan_2024.abstraction.example1;

public class Daughter extends Father {

    @Override
    void loan5CR() {
        System.out.println("Yes, I will give");
    }

    @Override
    void loan100CRGranF() {
        System.out.println("I am loan100CRGranF method of Daughter class");
    }

    @Override
    void lottery500CR() {
        System.out.println("I am lottery500CR method of Daughter class");
    }
}

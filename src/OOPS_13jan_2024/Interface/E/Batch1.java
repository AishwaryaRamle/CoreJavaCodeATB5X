package src.OOPS_13jan_2024.Interface.E;

public class Batch1 implements Testing {
    @Override
    public void manual() {
        System.out.println("Learning Manual Testing Concepts");
    }

    @Override
    public void Automation() {
        System.out.println("Learning Automation Testing concepts");
    }
}

class M {
    public static void main(String[] args) {
        Batch1 b = new Batch1();
        b.manual();
        b.Automation();
        b.QATest();

    }
}








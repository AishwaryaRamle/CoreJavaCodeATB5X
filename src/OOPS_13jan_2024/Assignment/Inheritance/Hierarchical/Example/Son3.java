package src.OOPS_13jan_2024.Assignment.Inheritance.Hierarchical.Example;

public class Son3 extends Father {
    public void Son3Test()
    {
        System.out.println("Son 3: Only living for myself and I will use 3 BHK with paying loan of 20 lakhs");
    }

    public static void main(String[] args) {
        Son3 obj3 = new Son3();
        obj3.Son3Test();
        obj3.BHK3();
        obj3.loan();


    }

}

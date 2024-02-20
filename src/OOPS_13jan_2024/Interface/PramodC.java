package src.OOPS_13jan_2024.Interface;

public class PramodC implements FatherI {

    @Override
    public void loan1k() {
        System.out.println("I will give you LOAN!");
        print(); //default method
        FatherI.print2(); //static method
    }

    public static void main(String[] args) {
        PramodC a=new PramodC();
        a.loan1k();
    }
}

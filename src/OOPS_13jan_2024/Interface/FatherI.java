package src.OOPS_13jan_2024.Interface;

interface FatherI {
    void loan1k();

    default void print()
    {
        System.out.println("I am default method");
    }
    static void print2(){
        System.out.println("I am static METHOd!");
    }

}

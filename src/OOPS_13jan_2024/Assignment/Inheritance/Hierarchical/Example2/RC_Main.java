package src.OOPS_13jan_2024.Assignment.Inheritance.Hierarchical.Example2;

public class RC_Main {
    public static void main(String[] args) {
        ATB4XBatch at4=new ATB4XBatch();
        at4.MultiThreadingCourseAccess();
        System.out.println("\n");

        ATB5XBatch at5=new ATB5XBatch();
        at5.MultiThreadingCourseAccess();
        System.out.println("\n");

        MultiThreading mt1=new ATB4XBatch(); // mt1 is Reference of Multithreading, and it is accessed using ATB4XBatch object
        mt1.MultiThreadingCourseAccess();
        System.out.println("\n");

        MultiThreading mt2=new ATB5XBatch();
        mt2.MultiThreadingCourseAccess();

    }


}

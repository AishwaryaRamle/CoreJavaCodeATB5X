package src.OOPS_14_JAN_2024.Threads_Demo.Synchronization;

public class Syn02 {
    public static void main(String[] args){

    Casee t1 = new Casee("A");
        t1.start();

    Casee t2 = new Casee("B");
        t2.start();

}
}

/**
 * Q1) Any Chance to get Inconsistent Results in this case?
 * Ans: NO
 * Q2) Threads will run concurrently or not?
 * Ans: Yes, will run concurrently
 *
 * */
class Casee extends Thread{

    public Casee(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" -> "+Thread.currentThread().getName());
//            m1();
//            m2();
        }
    }

    void m1(){
        System.out.println("m1()");
    }
    void m2(){
        System.out.println("m2()");
    }

}

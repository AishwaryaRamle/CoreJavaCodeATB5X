package src.OOPS_14_JAN_2024.Threads_Demo;

public class Task01 {
    public static void main(String[] args) throws InterruptedException {

        Thread t = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" - "+t.getName());
            Thread.sleep(5000);
            // Who is creating this Thread?
            // JVM
        }
    }
}

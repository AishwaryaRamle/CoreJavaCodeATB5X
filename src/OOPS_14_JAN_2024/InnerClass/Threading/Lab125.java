package src.OOPS_14_JAN_2024.InnerClass.Threading;

public class Lab125 {
    public static void main(String[] args) {
        Thread t = new Thread()
        {
            @Override
            public void run() {
                System.out.println("I am a Thread!!");
            }
        };
        t.run();
    }
}

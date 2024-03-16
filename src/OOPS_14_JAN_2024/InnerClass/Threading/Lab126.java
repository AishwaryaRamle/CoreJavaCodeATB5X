package src.OOPS_14_JAN_2024.InnerClass.Threading;

public class Lab126 {
    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is Runnable!!!");
            }
        };
r.run();
    }
}

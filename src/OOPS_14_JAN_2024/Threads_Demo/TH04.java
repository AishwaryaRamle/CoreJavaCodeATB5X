package src.OOPS_14_JAN_2024.Threads_Demo;

public class TH04 {
    public static void main(String[] args) {
        Runnable w1 = new WorkerTH04();
        Thread t1 = new Thread(w1);
        t1.start();

        Runnable w2 = new WorkerTH04();
        Thread t2 = new Thread(w2);
        t2.start();
       // t2.setPriority(8);// 1 is lowest ,5 is normal and 10 is highest priority


        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(i+"---"+Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}

    class WorkerTH04 implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }



package src.OOPS_14_JAN_2024.Threads_Demo;


class MultiThreadingRun extends Thread {
    public void run() {

            try {
                System.out.println("Thread " + Thread.currentThread().getName() + " is running!!!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

public class MultiThread_R {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            Runnable ru = new MultiThreadingRun();
            Thread th = new Thread(ru);
            th.start();

            //OR
//            Thread obj=new Thread(new MultiThreadingRun());
//            obj.start();

        }
    }


}



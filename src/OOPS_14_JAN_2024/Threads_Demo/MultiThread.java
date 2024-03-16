package src.OOPS_14_JAN_2024.Threads_Demo;

public class MultiThread {

    public static void main(String[] args) {
        int n = 5;//Number of Threads
        for (int i = 0; i < n; i++) {
          //  System.out.println(Thread.currentThread());//will get id of main class 5 time
            MultithreadingDemo object = new MultithreadingDemo();
            object.start();
        }

    }

    }


    class MultithreadingDemo extends Thread {

        public void run() {

                try {

                    //Displaying the thread that is running

                   // System.out.println("Thread " + Thread.currentThread().getName() + " is running!!!");
                    //Thread.sleep(2000);

                } catch (Exception e) {
                    //Throwing an excepttion.
                    System.out.println("Exception is caught");
                }

            }
        }





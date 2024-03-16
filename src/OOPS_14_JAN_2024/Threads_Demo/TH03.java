package src.OOPS_14_JAN_2024.Threads_Demo;

public class TH03 {
    public static void main(String[] args) {

            ThreadGroup threadGroup = new ThreadGroup("Worker");

            WorkerTHO3 w1 = new WorkerTHO3(threadGroup, "w1");//New state
            w1.start();

            WorkerTHO3 w2 = new WorkerTHO3(threadGroup, "w2");
            w2.start();


            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName());
               } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

class WorkerTHO3 extends Thread{
    WorkerTHO3(ThreadGroup threadGroup,String name){
        super(threadGroup,name);
    }
    @Override
    public void run() {

        for (int i=0;i<5;i++)
       {
            try {
                System.out.println(Thread.currentThread().getName());
               Thread.sleep(2000);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}

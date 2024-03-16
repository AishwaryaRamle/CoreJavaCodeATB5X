package src.OOPS_14_JAN_2024.Threads_Demo.Synchronization.Case3;
/*1.Two Method in one Class Sync with m1,and m2
2.They are Now Synchronizated.
3.Thread A,B
4.Thread A calling m1 s1 and Thread B calling m2 with s1
5.Inconsistent Result   No    Lock on Object
6.Thread will run concurrently   No sync one by one
public class SyncDemo3 {
}
*/
public class SyncDemo3 {

    public static void main(String[] args) throws Exception{
        Sync s1=new Sync();
//        Sync s2=new Sync();
        A ta=new A(s1,"A");
        ta.start();
        B tb=new B(s1,"B");
        tb.start();
    }
}
class A extends Thread {

    Sync s;

    public A(Sync s, String tname) {
        super(tname);
        this.s = s;
    }

    public void run() {
        s.m1();
    }


}

class B extends Thread {

    Sync s;

    public B(Sync s, String tname) {
        super(tname);
        this.s = s;
    }

    public void run() {
        s.m2();
    }
}

class Sync {
    synchronized void m1() {
        Thread th = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println(th.getName() + " - m1 -" + i);
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
            }
        }
    }

    synchronized void m2() {
        Thread th = Thread.currentThread();
        for (int i = 101; i <= 105; i++) {
            System.out.println(th.getName() + " - m2 -" + i);
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
            }
        }
    }
}
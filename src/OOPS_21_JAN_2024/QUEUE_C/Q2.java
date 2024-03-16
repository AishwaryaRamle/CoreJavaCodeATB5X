package src.OOPS_21_JAN_2024.QUEUE_C;

import java.util.PriorityQueue;

public class Q2 {
    public static void main(String[] args) {
        PriorityQueue pq1=new PriorityQueue<>();
        pq1.offer(10);
        pq1.offer(20);
        pq1.offer(30);
        pq1.offer(40);
        pq1.offer(50);
        //pq1.offer(null); show null Exception.
        System.out.println(pq1);

    }
}

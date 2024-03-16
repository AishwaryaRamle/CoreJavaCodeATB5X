package src.OOPS_21_JAN_2024.QUEUE_C;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q1 {
    public static void main(String[] args) {

        Queue queue = new PriorityQueue();
        //FIFO-->1,2,3--->1,2,3
        //offer-Add
        //Priority Queue--->Sorted
        queue.offer(20);
        queue.offer(10);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        queue.add(60);

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());


    }
}

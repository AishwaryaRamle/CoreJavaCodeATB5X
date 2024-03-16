package src.OOPS_21_JAN_2024.QUEUE_C;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q3 {
    public static void main(String[] args) {
        Queue<Integer> integerQueue=new PriorityQueue<>();
        integerQueue.add(1);
        System.out.println(integerQueue);
        integerQueue.poll();
        System.out.println(integerQueue);


        Queue q1=new PriorityQueue<>();
        q1.add("A");
        q1.add("B");
        q1.add("c");
        System.out.println(q1);
        q1.poll();
        System.out.println(q1);


        Iterator iterator=q1.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }





    }
}

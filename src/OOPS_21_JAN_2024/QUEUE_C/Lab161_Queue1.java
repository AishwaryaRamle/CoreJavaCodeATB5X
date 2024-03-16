package src.OOPS_21_JAN_2024.QUEUE_C;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lab161_Queue1 {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new PriorityQueue<>();
        //Arranged in order of Processing
        integerQueue.add(222);
        integerQueue.add(25);
        integerQueue.add(11);
        integerQueue.offer(135);

        System.out.println(integerQueue);
        // integerQueue.poll();
        System.out.println(integerQueue.peek());


//        System.out.println("-----");
//
//        for (Integer in:integerQueue
//             ) {
//            System.out.println(in);
//        }
//        System.out.println("-----");

        Iterator iterator = integerQueue.iterator();
        while (iterator.hasNext()) {
            //System.out.println(iterator.next());
            System.out.print(iterator.next()+" ");
        }
//
//
//        System.out.println("\n");
//        Queue<String> stringQueue = new PriorityQueue<>();
//        //Arranged in order of Processing
//        stringQueue.add("Hello");
//        stringQueue.add("The");
//        stringQueue.add("Testing");
//        stringQueue.offer("Academy");
//
//        System.out.println(stringQueue);

    }
}

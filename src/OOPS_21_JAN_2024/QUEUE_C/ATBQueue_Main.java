package src.OOPS_21_JAN_2024.QUEUE_C;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ATBQueue_Main {
    public static void main(String[] args) {
        ATBStudent s1=new ATBStudent(10,"Aishwarya","ATB");
        ATBStudent s2=new ATBStudent(2,"Madhuri","ATB");

        PriorityQueue<ATBStudent> priorityQueue=new PriorityQueue<>();
        priorityQueue.add(s1);
        priorityQueue.add(s2);

        System.out.println(priorityQueue);

        Iterator iterator= priorityQueue.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}

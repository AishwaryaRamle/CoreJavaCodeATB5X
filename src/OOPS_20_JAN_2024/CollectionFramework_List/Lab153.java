package src.OOPS_20_JAN_2024.CollectionFramework_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab153 {
    public static void main(String[] args) {
        List<String> mylist=new LinkedList<>();
        mylist.add("Aishwarya");
        mylist.add("Ramle");
        System.out.println(mylist);
        System.out.println("------");

        for (Object o: mylist) {
            System.out.println(o);

        }

        System.out.println("------");

        List<Integer> lstint=new LinkedList<>();
        lstint.add(1);
        lstint.add(2);
        lstint.add(3);


        Iterator iterator=lstint.listIterator();
        while (iterator.hasNext())
        {
           // lstint.add(4);
            System.out.println(iterator.next());
        }

    }
}

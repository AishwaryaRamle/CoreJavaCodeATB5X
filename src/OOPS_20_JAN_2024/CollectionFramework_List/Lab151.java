package src.OOPS_20_JAN_2024.CollectionFramework_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab151 {
    public static void main(String[] args) {
      //List mylist=new List();//list is abstract cannot be instantiated
        List mylist=new ArrayList(); //ArrayList is class
        mylist.add("Aishwarya");
        mylist.add("Ameya");
        mylist.add("Anya");
        mylist.add("TRUE");
        mylist.add(123);

        System.out.println(mylist);
        mylist.set(1,"Rani");
        System.out.println(mylist);
        mylist.remove(1);
        System.out.println(mylist);

        System.out.println(" --- ");
        //For Loop
        for (int i=0;i<mylist.size();i++){
            System.out.println(mylist.get(i));
        }

        System.out.println(" --- ");
        //For Each Loop
        for (Object o: mylist) {
            System.out.println(o);
        }

        System.out.println(" --- ");
        //Iterator
        Iterator iterator= mylist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}

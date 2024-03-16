package src.OOPS_20_JAN_2024.CollectionFramework_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lab152 {
    public static void main(String[] args) {
        List<String> mylist1=new ArrayList();//store only String Values.
        List<Integer> mylist=new ArrayList<>(); //store only Integer values.
        //ArrayList are not thread safe,Getting value is easy(i.e Fetching of value) in ArrayList
        //inserted and Deleted are difficult in ArrayList.

        //Linked List are used mostly when values are inserted and Deleted
        Collection Clist=new ArrayList<>(); //Collection is parent class(like grandfather class) of List


//        Vector v = new Vector<>(); // same as Array List, but they are Synchronized in nature(
//        i.e. done one by one and are thread safe in nature
//        v.add("pramod"); - t1
//        v.add("AMIT"); - t1
//        v.add("LUCKY"); t1




    }
}

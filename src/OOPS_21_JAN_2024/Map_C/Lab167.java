package src.OOPS_21_JAN_2024.Map_C;

import java.util.*;

public class Lab167 {

    //TreeMap sort automatically based on natural ordering
    public static void main(String[] args) {
          Map m1=new TreeMap<>();
        //Map m1=new LinkedHashMap();// show in the format as it is added.
        //Map m1=new HashMap(); // show in the random format as it is added.
        m1.put("name","Aishwarya");
        m1.put("age","31");
       // m1.put(3,null);
       // m1.put(234,34); //allowed in LinkedHashMap,Hashmap
        System.out.println(m1);


        Hashtable<Integer,String> ht=new Hashtable<>(); //Hashtable is synchronized
        //syn--Thread safe
        ht.put(1,"pramod");
        ht.put(2,"Amit");
       // ht.put(3,null);//null values not allowed in Hashtable,allowed in HashMap.
        System.out.println(ht);


    }

}

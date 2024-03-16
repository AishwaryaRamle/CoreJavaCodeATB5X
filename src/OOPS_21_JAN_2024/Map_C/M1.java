package src.OOPS_21_JAN_2024.Map_C;

import java.util.*;

public class M1 {
    public static void main(String[] args) {
        //Map<String,Integer> map = new LinkedHashMap<>(); //order maintained
        //Map<String,Integer> map = new HashMap<>();//---order not maintained
        Map<String,Integer> map = new TreeMap<>();//automatically alphanumeric sorting on keys
        //Map<String,Integer> map = new WeakHashMap<>();

        map.put("id",1);
       // map.put("id",2);//will take latest value
        map.put("id2",2);//can have same value for key e.g for id2=1
        map.put("id3",3);
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsKey("id"));
        System.out.println(map.containsKey("Id")); //case sensitive
        System.out.println(map.containsValue(2));
        System.out.println(map.containsValue(20));
        System.out.println(map.get("id2"));
        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println("-----------");

        for (Map.Entry <String,Integer> item:map.entrySet()
             ) {
            System.out.println(item.getKey()+"--->"+item.getValue());
           // System.out.println(item);
        }

    }
}

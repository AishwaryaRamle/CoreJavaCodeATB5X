package src.OOPS_21_JAN_2024.Map_C;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class Lab165_Map {
    public static void main(String[] args) {
        Map<String,Integer> hm=new HashMap<>();
        hm.put("a",100);
        hm.put("b",200);
        hm.put("c",300);
        hm.put("d",400);
        System.out.println(hm);

        //Travesing through map using for-each loop
        for (Map.Entry<String,Integer> me:hm.entrySet()) {
            //Printing keys
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());

        }


    }
}

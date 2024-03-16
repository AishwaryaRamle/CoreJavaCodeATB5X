package src.OOPS_21_JAN_2024.Map_C;

import java.util.HashMap;

public class Lab166_Map {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"Mango");
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(1,"Grapes");
        System.out.println(map);
        map.remove(1);
        System.out.println(map);
        map.remove(103);//value not present

        map.putIfAbsent(103,"Grapes");
        System.out.println(map);

        map.remove(103,"Grapes");
        System.out.println(map);
    }
}

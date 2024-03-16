package src.OOPS_21_JAN_2024.Map_C;

import java.util.HashMap;
import java.util.Map;

public class Lab163_Map {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("name","Ramle");
        map.put("name","Aishwarya");// show latest value
        map.put("Address","Mumbai");
        System.out.println(map);

    }
}

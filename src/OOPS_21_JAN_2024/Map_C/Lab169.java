package src.OOPS_21_JAN_2024.Map_C;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Lab169 {
    public static void main(String[] args) {
        //Iterator with hashmap
        //In Map have to use entrySet()
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(6,"Tushar");
        hm.put(12,"AShu");
        hm.put(5,"Zoya");
        hm.put(78,"yash");
        hm.put(10,"praveen");
        hm.put(67,"Boby");
        hm.put(1,"Ritesh");

        for (Map.Entry<Integer,String> e:hm.entrySet())
        {
            System.out.println(e.getKey() +"---->"+e.getValue());
        }

        System.out.println("--- ---- -----");

        Set set=hm.entrySet();
        Iterator iterator=set.iterator();
        while (iterator.hasNext())
        {
            Map.Entry<Integer,String> map= (Map.Entry)iterator.next();
            System.out.println(map.getKey() +"---->"+map.getValue());
        }
    }

}

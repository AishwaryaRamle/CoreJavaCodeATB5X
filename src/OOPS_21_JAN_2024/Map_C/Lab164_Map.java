package src.OOPS_21_JAN_2024.Map_C;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lab164_Map {
    public static void main(String[] args) {
        Map<Integer,String> studMap=new HashMap<>();
        studMap.put(1,"Aishwarya");
        studMap.put(2,"Anya");
        studMap.put(3,"Ameya");
        studMap.put(4,"Spruha");
        System.out.println(studMap);

        //  Collection c=null;//Collection is Interface
        //  Collections.sort();//Collections is Class

        //studMap.put("name","Hello");--string,string not possible.
        studMap.put(-1,"Mohit");
        studMap.put(null,"Rani");//one null value allowed and if multiple are present take latest value.
       // studMap.put(null,"Hello");
        System.out.println(studMap);

        System.out.println("================================");
        System.out.println(studMap.get(4));

        System.out.println("================================");
        Set a=studMap.entrySet(); ///Set is list of unique Element
        System.out.println(a);

        //Iterator not supported in Map
        //To Get all the values use EntrySet()

        System.out.println("================================");
        for (Map.Entry<Integer, String> e:studMap.entrySet())
        {
            System.out.println(e.getKey()+"---->"+e.getValue());
        }



    }
}

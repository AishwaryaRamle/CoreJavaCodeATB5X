package src.OOPS_21_JAN_2024.Map_C;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PM_Map {
    public static void main(String[] args) {

        String msg="Hii Aishwarya Ramle, How are you Aishwarya ?";
        Map<String,Integer> wordsMap=new HashMap<>();

        String[]  words= msg.split(" ");

//        for (String s:
//             words) {
//
//            System.out.println(s);
//        } for printing  Strings line by line


        for (String s:words) {
            Integer count=wordsMap.get(s);
            if(count==null)
            {
                wordsMap.put(s,1);
            }else {
                wordsMap.put(s,count+1);

            }

        }
        System.out.println(wordsMap);
    }
}

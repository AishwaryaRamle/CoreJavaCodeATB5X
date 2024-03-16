package src.OOPS_21_JAN_2024.LIST_C;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab158 {
    public static void main(String[] args) {
        List<Integer> mymarks=new ArrayList<Integer>();
        mymarks.add(89);
        mymarks.add(100);
        mymarks.add(80);
        Collections.sort(mymarks);
        System.out.println(mymarks);


    }
}

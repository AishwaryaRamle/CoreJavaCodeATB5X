package src.OOPS_21_JAN_2024.LIST_C;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// import java.util.*; This is bad practice

public class Lab154 {
    public static void main(String[] args) {
        List<String> courseList=new ArrayList<>();
        courseList.add("ATB");
        courseList.add("MTB");
        courseList.add("PyTB");
        courseList.add("LAPIB");
        courseList.add("SDET Blueprint");

        List numList=new ArrayList<>();
        numList.add(100);
        numList.add(150);
        numList.add(100);
        numList.add(399);


        courseList.addAll(numList);
        System.out.println(courseList);

        Iterator iterator=courseList.iterator();
        while (iterator.hasNext())
        {
          // courseList.add("Gen AI");
            System.out.println(iterator.next());
        }

        System.out.println("\n");

//        List mylist1=courseList.subList(2,4);
//        System.out.println(mylist1);



    }
}

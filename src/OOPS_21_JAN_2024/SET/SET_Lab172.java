package src.OOPS_21_JAN_2024.SET;

import java.util.LinkedHashSet;
import java.util.Set;

public class SET_Lab172 {
    public static void main(String[] args) {
        //LinkedHashSet store data in the order as added by user
        //TreeSet store element in sorted order.

        Set<Object> courseSets =new LinkedHashSet<>();
        courseSets.add("ATB");
        courseSets.add("MTB");
        courseSets.add("LAPIT");
        courseSets.add("SDET BluePrint");
        courseSets.add("Java for Tester");
        System.out.println(courseSets);
    }
}

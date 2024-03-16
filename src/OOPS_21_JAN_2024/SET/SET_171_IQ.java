package src.OOPS_21_JAN_2024.SET;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SET_171_IQ {
    public static void main(String[] args) {
        Set courseset=new HashSet<>();
        courseset.add("ATB");
        courseset.add("MTB");
        courseset.add("LAPIT");
        courseset.add("SDET BluePrint");
        courseset.add("Java for Tester");
        System.out.println(courseset);

        for (Object s: courseset) {
            System.out.println(s);
        }
        System.out.println("-----------------------");
        Iterator iterator= courseset.iterator();
        {
            while (iterator.hasNext())
            {
                System.out.println(iterator.next());
            }
        }

    }

}

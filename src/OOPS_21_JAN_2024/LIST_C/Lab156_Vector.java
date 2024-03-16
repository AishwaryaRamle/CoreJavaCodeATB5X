package src.OOPS_21_JAN_2024.LIST_C;

import java.util.Enumeration;
import java.util.Vector;

public class Lab156_Vector {
    public static void main(String[] args) {
        Vector<String> v=new Vector<>();
        v.add("The");
        v.add("Testing");
        v.add("Academy"); // Array - can store similar only
        System.out.println(v);

        Enumeration e=v.elements();
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }

    }
}

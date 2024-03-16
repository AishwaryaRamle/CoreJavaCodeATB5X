package src.OOPS_21_JAN_2024.Map_C;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab168_Hashtable {
    public static void main(String[] args) {
        //HashTable is Legacy class

        Hashtable<Integer,String> ht1=new Hashtable<>();
        ht1.put(1,"one");
        ht1.put(2,"Two");
        ht1.put(3,"Three");

        Enumeration<Integer> e= ht1.keys();
        //Enumeration are used for legacy class(like Vector,Hashtable,properties)

        //Iterating through the Hashtable
        //object

        //Checking for the next element in Hashtable object
        //with the help of hashElements() method

        while (e.hasMoreElements())
        {
           // System.out.println(e.nextElement());
            //Getting the key of a particular entry
            int key = e.nextElement();

            //print and display the Rank and Name
            System.out.println("Rank : " + key
            + "\t\t Name : " + ht1.get(key));
        }

    }

}

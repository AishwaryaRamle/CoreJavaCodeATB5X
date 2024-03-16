package src.OOPS_21_JAN_2024.SET;

import java.util.HashSet;
import java.util.Set;

public class Set_Lab170 {
    //Set is Interface, store only unique value ,collection of items
    public static void main(String[] args) {
        Set<String> fruits=new HashSet<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Orange");
        fruits.add("Water Melon");
        System.out.println(fruits);
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.size());
        System.out.println(fruits.contains("Apple"));
        System.out.println(fruits.contains("apple")); //set is case-sensitive

        //Hashset no order is maintained...
    }
}

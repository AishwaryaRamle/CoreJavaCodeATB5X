package src.OOPS_21_JAN_2024.LIST_C;

import java.util.*;

public class Lab160 {
    public static void main(String[] args) {
        List<Integer> myMarks=new ArrayList<>();
        myMarks.add(91);
        myMarks.add(87);
        myMarks.add(80);
        Collections.sort(myMarks);
        System.out.println(myMarks);

        Students s= new Students(1,"Spruha");
        Students s1= new Students(10,"Ramle");
        Students s2= new Students(3,"Aishwarya");
        System.out.println(s);

        List<Students> students=new ArrayList<>();
        students.add(s);
        students.add(s1);
        students.add(s2);
        System.out.println(students);


        // Comparable -> 1 id or name not both are not allowed -
//        Collections.sort(students); //compare 1st student with second then second with third...
//        System.out.println(students);

        // Comparator - id, name
        // Create a class and implement comparator and tell to compare by Integer.compare or For String Comparison we use compareTo
        Collections.sort(students,new SortIdAsc());
        System.out.println(students);

        System.out.println("------");

        Collections.sort(students,new SortByNameDesc());
        System.out.println(students);


        }

    }


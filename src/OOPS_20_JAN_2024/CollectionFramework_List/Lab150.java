package src.OOPS_20_JAN_2024.CollectionFramework_List;

import java.util.List;
//List is set of Object--can store any type of datatype

public class Lab150 {
    public static void main(String[] args) {
        List fruites=List.of("orange","apple","banana","apple","watermelon");
        List shopping_items=List.of("AATA","MILK","BREAD","BUTTER","CHOC_SILK");
        List my_10th_marks=List.of(89,98,85,95,100);
        List diiferent_data_types=List.of("Aishwarya",true,123);

        System.out.println(fruites.get(0));
        System.out.println(fruites.size());
        System.out.println(fruites);
        System.out.println(fruites.indexOf("watermelon"));

        //ISEmpty
        System.out.println(fruites.isEmpty());
        //fruites.add("HEllo");Addition not allowed
        //  fruites.remove("apple"); Deletion not allowed

        // ArrayList, LinkedList, - Add or Replcae anything - Full Auth


    }

}
//list is a type of interface(i.e. they are incomplete classes someone need to complete them ---they are Array List(array list are classes)
//can't add values in list because .of is static function.
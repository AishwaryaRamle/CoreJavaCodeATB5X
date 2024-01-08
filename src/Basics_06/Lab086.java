package src.Basics_06;

import java.util.Arrays;

public class Lab086 {
    public static void main(String[] args) {
        int[] arr1={99, 92, 33, 43, 15};
        int arr2[]={99, 92, 33, 43, 15};
        System.out.println(Arrays.toString(arr1));
        //Double this array
        for (int i = 0; i <arr1.length ; i++)
        {
          // System.out.println(arr1[i]);

            System.out.println(arr1[i]*2);


        }
    }
}

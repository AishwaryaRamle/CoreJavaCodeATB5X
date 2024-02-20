package src.JavaPracticeProgram;

public class SplitString {
    public static void main(String[] args) {
        String str="Aishwarya Ramle";
        int strarray=str.length();

//        char[] arr=str.toCharArray();
//        System.out.println(arr);
//
//        for (int j=0;j<arr.length;j++)
//        {
//            System.out.println(arr[j]);
//        }//to Convert a String to an Array Using the toCharArray() Method

        System.out.println(strarray);
        System.out.println(str);

       // System.out.println(str.split(" ").toString());t's returning address instead of two different strings
        String[] str1=str.split(" ");
        System.out.println(str1.length);

        for (int i=0 ; i<str1.length;i++)

        {

            System.out.println(str1[i]);

        }
    }
}

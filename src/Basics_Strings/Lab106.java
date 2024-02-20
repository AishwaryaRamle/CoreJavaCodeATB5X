package src.Basics_Strings;

public class Lab106 {
    public static void main(String[] args) {
       String s1="Testing";
       String s2=new String("Testing");
       String s3=new String("testing");
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
    }
}

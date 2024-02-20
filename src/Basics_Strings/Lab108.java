package src.Basics_Strings;

public class Lab108 {
    public static void main(String[] args) {
        // Immutable in nature (that can't changed)
        String password = "pass@123";

        // 1000 times I am going to change the password value
        // should I use the String Buffer, String Builder OR String

        String str1=new String("Message1");
        str1.concat("Hello");
        str1.concat("World");
        System.out.println(str1+"--->This string belongs to SCP");

        // Mutable - that can be changed!!
        //String remains appending one by one on performing appending operation.
        StringBuilder password2 = new StringBuilder("Message1");
        password2.append(" Hello");
        password2.append(" World");
        System.out.println(password2+"--->This string belongs to StringBuilder");
    }
}

package src.Basics_Strings;

public class Lab103 {
    public static void main(String[] args) {
        String s1="Testing";//store in string constant pool,this strings are immutable in nature(i.e. unchanged)
        s1.concat("Academy");
        System.out.println(s1);

        StringBuffer sb1=new StringBuffer("Aishwarya ");//store in object area or Heap area,this strings are mutable in nature(i.e.changeable)
        sb1.append("Ramle");
        System.out.println(sb1);

    }
}

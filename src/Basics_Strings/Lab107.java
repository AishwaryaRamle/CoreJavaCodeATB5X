package src.Basics_Strings;

public class Lab107 {
    public static void main(String[] args) {
        // Immutable in nature (that can't changed)
        String s1 = "Pramod";
        String s2 = new String("Aishwarya");


        // Mutable - that can be changed!!

       //StringBuffer sbuf4 = new StringBuffer("Aishwarya");
        StringBuilder sbuild=new StringBuilder("Aishwarya");
        sbuild.append("Ramle");
        System.out.println(sbuild);


        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);
    }
}

package src.Basics_Strings;

public class Lab104 {
    public static void main(String[] args) {
        String name="Aishwarya";
        String s=new String("AishwaryaR");
        System.out.println(name== s);
        name="Ramle";
        System.out.println(name);

        String s1="Testing";
        s1.concat("Academy");//This will not print value because it is only stores in scp
        String s2=s1.concat("Academy");//This will print because it is assigned to s2 value.
        System.out.println(s2);

    }
}

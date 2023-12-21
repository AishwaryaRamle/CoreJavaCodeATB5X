package src.Basics_03_16Dec;

public class Lab023 {
    public static void main(String[] args) {
        String name = "The Testing Academy";
        String name1 = "The Testing Academy";
        String name2 = new String("The Testing academy"); // Heap area

        System.out.println(name == name1);
        System.out.println(name.equals(name1));

       // System.out.println(name == name2); name2 is in heap and name1 is in string constant pool;

        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));

    }
}

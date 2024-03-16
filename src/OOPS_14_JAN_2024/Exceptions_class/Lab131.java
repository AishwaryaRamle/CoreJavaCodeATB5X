package src.OOPS_14_JAN_2024.Exceptions_class;

public class Lab131 {

//    Exception -?>
//    event that occurs during the execution of a program
//    that disrupts the normal flow of instructions.

    public static void main(String[] args) {
        try {
            String name = null;
            name.trim(); // 100GB used! stackoverflow error
            System.out.println("Learning Try Catch Block!!!");
        } catch (Exception e) {
            System.out.println("You are trying to trim a null string that is not possible in java!!");
        }
        System.out.println("Hi I am the End");

    }
}

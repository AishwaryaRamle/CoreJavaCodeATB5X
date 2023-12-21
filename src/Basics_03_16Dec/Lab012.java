package src.Basics_03_16Dec;

public class Lab012 {
    public static void main(String[] args) {
        // Interview Question - Relational Operator
//       System.out.println( 10 == 10);
//       System.out.println( 10 >= 10);
//       System.out.println( 10 <= 10);
//       System.out.println( 10 > 10);
//       System.out.println( 10 < 10);
//
//       System.out.println("-------");

       //System.out.println('A' = 65); // Assign(in sop assigning 'A'=65 is not allowed but we can compare e.g 'A'==65)
        System.out.println('A' == 65); // ASCII(...character in sop are integer...)
        System.out.println('A');
        System.out.println('S');


        byte b=65;
        System.out.println('A'==65);
        System.out.println('A' == 65.0); // ? ( This is property of java)
        System.out.println('A' == 65.0f);
        System.out.println('A' == 65.2);
        System.out.println('A' == 65.00000);

        //below expression are not allowed.
        //System.out.println(true == 0);
        //System.out.println(true >= true);



    }
}

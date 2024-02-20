package src.OOPS_13jan_2024.Assignment.Example;

public class ATB5XStudent {
    public static void main(String[] args) {
        ATB5[] ATBStudents = new ATB5[3];
        ATBStudents[0] = new ATB5("Shirin", 25, "Physics");
        ATBStudents[1] = new ATB5("Raj", 22, "Chemistry");
        ATBStudents[2] = new ATB5("Muskan", 29, "Biotech");

        ATBStudents[0].setName("Aishwarya");
        ATBStudents[1].setName("Ameya");
        ATBStudents[2].setName("Mohit");


        for (int i = 0; i < ATBStudents.length; i++) {
            System.out.println(ATBStudents[i].toString());
        }
        }
}

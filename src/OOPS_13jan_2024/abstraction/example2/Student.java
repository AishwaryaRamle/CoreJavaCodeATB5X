package src.OOPS_13jan_2024.abstraction.example2;

public class Student extends PramodTheTutor {
    @Override
    void doHW() {
     System.out.println("Do Home Work!!!");
        iwillMakeYoutAT();
    }

    public static void main(String[] args) {
        ATB5XBatch(); //it is static method in PramodTheTutor class.
        Student s=new Student();
        s.doHW(); //abstract method.
        s.iwillMakeYoutAT(); //

        System.out.println("\n");

    }
}

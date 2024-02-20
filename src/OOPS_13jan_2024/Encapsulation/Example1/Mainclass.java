package src.OOPS_13jan_2024.Encapsulation.Example1;

public class Mainclass {
    public static void main(String[] args) {

        Student s= new Student();
        s.name="Aishwarya";
        s.name="Anya";
        // Getter and setter - Condition Based
        // They should hidden

        PersonS persons =new PersonS(); //able to access and reset all value of attribute of person class
        //if we need restriction to imposed on accessing values we use conception of getter and setter, encapsulation
        persons.id = 1;
        persons.id = 99;
        persons.id = -1;
        persons.bal = 999;

    }

}

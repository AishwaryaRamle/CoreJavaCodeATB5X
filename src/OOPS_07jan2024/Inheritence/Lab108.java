package src.OOPS_07jan2024.Inheritence;

public class Lab108 {
    public static void main(String[] args) {
        //Programming p=new Programming();
       // Java j=new Java();
        //j.printInfo();
        //Programming p=new Java();
       // Java p1=new Programming();---this is invalid calling,child refrence is not able to access parent refrence.

        Java j=new Java();
        j.author="aa";
        j.printInfo();
        j.car();
        j.bhk3();


        System.out.println("-----New Java class object with PC------");

        Java j1=new Java("Compatibility");
        j1.author="XYZ";
        j1.printInfo();

        System.out.println("-----Python object-----");

        Python p=new Python();
        p.bhk3();
    }
}

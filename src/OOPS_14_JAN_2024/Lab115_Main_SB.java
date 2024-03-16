package src.OOPS_14_JAN_2024;

public class Lab115_Main_SB {
    public static void main(String[] args) {
        //System.out.println(Lab116.pin); access Lab116 variable with class name as it is static variable.

//        System.out.println(StaticDemo.College_name);
//        StaticDemo.printName();


        StaticDemo s1=new StaticDemo();
        s1.version=199;
        s1.printDetails();


        StaticDemo.College_name="TTA";
        StaticDemo s2=new StaticDemo();
        s2.version=200;
        s2.printDetails();

    }
}

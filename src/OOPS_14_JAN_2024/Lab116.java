package src.OOPS_14_JAN_2024;

public class Lab116 {
    static int pin=61;
    String name;
    String phone;
    Lab116(String name1,String phone1)
    {
        this.name=name1;
        this.phone=phone1;
        System.out.println("Details!!!");
    }
    void  details()
    {
        System.out.println("Name is: "+ name);
        System.out.println("Phone number is: "+phone);
    }

    public static void main(String[] args) {
        Lab116 l1=new Lab116("Aish","999999");
       // l1.name="Hello";
        l1.details();
        System.out.println("PinCode of Area is :"+pin); // acessible directly as it is static variable.
    }
}

package src.OOPSCONCEPTS;

public class ModifyAttribute {
    String name;
    String email;
    int age;
    String address="Mumbai";

   /* void details()
    {
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);
    }*/

    public static void main(String[] args) {
        ModifyAttribute obj1=new ModifyAttribute();
        obj1.name="Aishwarya";
        obj1.email="abc@gmail.com";
        obj1.age=20;

        System.out.println(obj1.name);
        System.out.println(obj1.email);
        System.out.println(obj1.age);
        System.out.println("Address--->"+ obj1.address);
//        System.out.println("-------Called through Method-------");
//        obj1.details();


    }

}

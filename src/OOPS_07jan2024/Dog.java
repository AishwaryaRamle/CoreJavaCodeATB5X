package src.OOPS_07jan2024;

public class Dog {
    String name; // Instance Variable
    String breed;

    Dog(){
        System.out.println("DC");
    }

    Dog(String nameRef){
        this.name = nameRef;
        System.out.println("PC");
    }

    Dog(String name, String breed)
    {
     this.name=name;
     this.breed=breed;
    }

    void bark(){
        int age = 10; // Local Variable
        System.out.println("Bark");
        System.out.println("Dog name is -> "+ this.name);
    }

    void dogDetails()
    {
        System.out.println("Dog Name is "+this.name);
        System.out.println("Dog breed is "+this.breed);
    }
}

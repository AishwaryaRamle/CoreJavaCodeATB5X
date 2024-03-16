package src.OOPS_13jan_2024.Super;

public class TestSuper3 {
    public static void main(String[] args) {
        Dog3 d3=new Dog3();


    }
}
class Animall {
    // default or no-arg constructor
    Animall()
    {System.out.println("animal is created");
    }

    // parameterized constructor
//    Animall(String type)
//    {
//        System.out.println("Type"+type);
//    }
}
class Dog3 extends Animall{
    Dog3(){
        // calling parameterized constructor of the superclass
       // super("Animal");

        // default constructor
        super(); //with and without super keyword output is ame,
        System.out.println("dog is created");
    }
}

//https://www.geeksforgeeks.org/using-the-super-keyword-to-call-a-base-class-constructor-in-java/---refer for Constructor Overloading With Super
//https://www.shiksha.com/online-courses/articles/super-keyword-in-java/

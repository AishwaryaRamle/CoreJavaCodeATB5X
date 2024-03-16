package src.OOPS_13jan_2024.Super;

//1) super is used to refer immediate parent class instance variable.

public class TestSuper1 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.printColor();
    }

    }

class Animal{
    String color="white";
}
class Dog extends Animal{
    String color="black";
    void printColor(){
        System.out.println("color of Dog class is: "+color);//prints color of Dog class
        System.out.println("color of Animal class is: "+super.color);//prints color of Animal class
    }
}

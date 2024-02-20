package src.OOPSCONCEPTS;

public class Static_Public {
    //static method
    static void mystaticmethod()
    {
        System.out.println("Static methods can be called without creating objects");
    }

    //public method
    public void mypublicmethod()
    {
        System.out.println("Public methods must be called by creating objects");
    }

    //main method
    public static void main(String[] args) {
        mystaticmethod();// Call the static method
        //myPublicMethod(); This would compile an error

        Static_Public sp=new Static_Public();// Create an object of Main class(i.e.Static_Public)
        sp.mypublicmethod();// Call the public method on the object
    }

    }


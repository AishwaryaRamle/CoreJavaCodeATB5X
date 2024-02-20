package src.OOPS_13jan_2024.abstraction.example3;
abstract class AbsAnimal {
        public abstract void animalSound();
    // Abstract method (does not have a body)
        public void sleep() {
            // Regular method
            System.out.println("Zzz");
        }
    }
// Subclass (inherit from Animal)
class Pig extends AbsAnimal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
    }
}

class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}


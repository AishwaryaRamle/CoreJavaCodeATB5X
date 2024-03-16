**In Multilevel Inheritance,Main class ref object can use to create child class object**

GrandFather g1=new Father();

GrandFather g1=new Son();


**In above Example,with g1 ref obj it is able to call only 
Main class function(e.g Gandfather class functions)**

Father f1 =new Son();

**In above Example,with f1 ref obj it is able to call 
Main class,subclass Father function (e.g Grandfather and Father class functions)**

**In Method Overriding, child class object is used to refer particular class method** 

Animal myPig = new Pig();  // Create a Pig object

myAnimal.animalSound();

Here with main class reference object child class function is called.

Animal myDog = new Dog();  // Create a Dog object

myPig.animalSound();

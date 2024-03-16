package src.OOPS_14_JAN_2024.InnerClass;

public class Lab127 {
    public static void main(String[] args) {

//        Parent parent=new Parent();
//        Child child=new Child();
//        parent=child;
//        child=parent;//not possible


        Hello h=new Hello();
        Hello h2=new Hello();

 //     Child2 c2=new Child2();

        Hello hello=new Child2();   //upcasting
        //Child2 child2 =hello; not possible

        Child2 child2 =(Child2)hello;  //Down casting in class
        Child2 chi =(Child2)h2;  //Down casting in class


    }
}

class Hello{

}

class Child2 extends Hello{

}

//Upcasting and Downcasting in Class
class Parent{
}

class Child extends Parent{

}

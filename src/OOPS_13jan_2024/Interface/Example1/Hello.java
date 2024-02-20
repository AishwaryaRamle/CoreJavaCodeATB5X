package src.OOPS_13jan_2024.Interface.Example1;

public class Hello implements Interface1 {



   @Override
    public void say() {
       System.out.println("I am from say method of Hello class");
        hello();
    }


    public void hello() {
        System.out.println("I am from hello method of Hello class");// subclass Hello method
     //   Interface1.super.hello();    want to call Hello method of Parent class
    }

    }



package src.OOPS_14_JAN_2024.Interview_Questions;

public class Abstract01 {
}

abstract class Person01
{
    abstract void say();
    abstract void say2();
    void eat()
    {
        System.out.println("eat method from Peron01 abstract lass");
    }
}

abstract class Student1 extends Person01
{
abstract void details();
abstract void div();
}
class Demo extends Student1
{

    @Override
    void say() {

    }

    @Override
    void say2() {

    }

    @Override
    void details() {

    }

    @Override
    void div() {

    }
}

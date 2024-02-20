package src.OOPS_13jan_2024.Interface.askInterviewQuestion;

public class Lab114 {

    public static void main(String[] args) {


    }
}

interface I1{}
interface I2{}

class A{}
class B{}
abstract class C{}
abstract class D{}

class Test1 extends A{ }
//class Test2 extends A,B{ }  two class extension not allowed
class Test3 implements I1{ }
class Test4 implements I1,I2{ } //two class implementation allowed
class Test5 extends A implements I1,I2{ }
//class Test6 implements I1 extends A{ }

//interface I3 extends A{}   interface doesn't extend any class but ,only class extend any other class
//interface I4 implements A{} interface doesn't implement class.
//interface I5 extends A,B{}
interface I6 extends I1,I2{ } //one interface can extend other Interface.

package src.OOPS_13jan_2024.Polymorphism.MethodOverridding.Example2;

public class CMain {
    public static void main(String[] args) {
        Class1 c1=new Class1();//Class1 obj and Class1 ref ,so only class1 method will execute
        c1.Div();

        Class2 c2=new Class2(); //same as above Class2 will get execute
        c2.Div();

        Class1 c3=new Class2();//IMP:- So here runtime polymorphism happen and class2 test method will get execute
        c3.Div();


        //Output:- Hi I am also from class1 method with no args from class2 ******IMP******
        //Also called as Dynamic Dispatch
        //Ambiguity which method should call as both have same name and args also
    }


}

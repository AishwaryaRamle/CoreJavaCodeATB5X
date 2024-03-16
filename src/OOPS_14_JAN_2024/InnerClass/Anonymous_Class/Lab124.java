package src.OOPS_14_JAN_2024.InnerClass.Anonymous_Class;

public class Lab124 {
    public static void main(String[] args) {
        //interface object cant be created
        Student s1= new Student() {  //Noname implements students(this is not shown but present as jvm is hiding this implementation
                                      //this is called Anonymous class)
            @Override
            public void setID() {    //Anonymous class

            }
        };
        s1.setID();

//        NoName s2 = new NoName();
//        s2.setId();
    }
B b =new B() {
// This is a Anonymous class
    // No Name
    };
}

abstract class B
{
    int var_b=12;
}

interface Student{
    int id=11;
    void setID();
}

//class NoName implements Student{
//
//    @Override
//    public void setId() {
//
//    }
//}
package src.OOPS_13jan_2024.Assignment.Inheritance.MultiLevel.Example2;

public class ATB5XBatch extends ATB3XBatch {

    ATB5XBatch(String name)
    {
        super(name);
        this.name=name;
        this.b=15;
        System.out.println("5x DC");
    }
//If a super class contains two or more constructors,
// but one of them is a default constructor which does not take any parameters,
// then it is not necessary to call it using the super keyword.
// It is called automatically.
// https://c1ctech.com/java-constructor-in-inheritance/

    void Batch5xCourse(){
        System.out.println("Access to 5x course");
    }
}

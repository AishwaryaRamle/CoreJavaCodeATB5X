package src.OOPS_13jan_2024.Assignment.Inheritance.MultiLevel.Example2;

public class ATB3XBatch extends ATB0XBatch{

    ATB3XBatch(String name)
    {
        this.name=name;
        System.out.println("3X DC");
    }
    void Batch3xCourse(){
        System.out.println("Access to 3x course");
    }

}

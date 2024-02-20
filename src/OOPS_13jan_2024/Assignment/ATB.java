package src.OOPS_13jan_2024.Assignment;

public class ATB {

    public int rollno;
    public String name;

    ATB(int rollno,String name)
    {
        this.rollno=rollno;
        this.name=name;
    }

    public String toString()
    {
        return "RollNO: "+ rollno+ " Name: "+name;
    }

    void PrintDetails(){
        System.out.println("rollno :" + this.rollno);
        System.out.println("name:" + this.name);

    }
}


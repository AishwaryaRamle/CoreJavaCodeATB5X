package src.OOPS_13jan_2024.Encapsulation.Example2;

public class Employee {
    private String name="test"; // Private variable not allowed to access/modify by outsiders directly
    private int id;

    public String getName() { ///We can allow to other members to read the private data(i.e. name value)

        return name;
    }

    public void setName(String name) { //we can allow to other members to modify private data (i.e. name)
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    void printdetails()
    {
        System.out.println("Employee Name "+ name+" and Employee ID is "+id);
    }

}

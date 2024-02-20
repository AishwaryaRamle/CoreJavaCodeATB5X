package src.OOPS_07jan2024.Inheritence;

public class Programming {
    int version;
    String author;
    Programming()
    {
        System.out.println("Program DC");
    }
    Programming(String author,int version)
    {
        this.author=author;
        this.version=version;
    }
    void printInfo(){
        System.out.println(" Program Info(version) ->  "+ this.version + " && Author " + this.author);
    }

    void car()
    {
        System.out.println("Lambo");
    }
    void bhk3()
    {
        System.out.println("3BHK House");
    }

}

package src.OOPS_07jan2024;

public class Person {
    String name;

    Person()
    {
        System.out.println("DC");
    }
    Person(String refname)
    {
        this.name=refname;
        System.out.println("PC");
    }

    Person(String ref_name,String age){
        this.name = ref_name;
    }

    Person(String ref_name,String age, int rollNo){
        this.name = ref_name;
    }

    void PrintDetails()
    {
        System.out.println("Your Name is ---->"+this.name);
    }
    void printDetail(String name){
        System.out.println("Your Name is -> " + this.name);
    }

    int printDetail(int a){
        System.out.println( "Number is --->"+a);
        return 99;
    }


}

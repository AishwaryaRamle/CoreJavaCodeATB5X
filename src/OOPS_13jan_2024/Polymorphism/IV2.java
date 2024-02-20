package src.OOPS_13jan_2024.Polymorphism;

public class IV2 {
    public static void main(String[] args) {
        Person02 h1=new Person02();
        Person02 h2=new Person02();
        Person02 h3=null;// not object just person02 pointing to null
        //h3.run(); not valid or NullPointerException
        h2.run();
    }
}


class Person02 {
    int a;
    void run(){
        System.out.println("Run called");
    }

}

package src.OOPS_13jan_2024.Polymorphism;
class Person {
    int a;
    boolean b;

    // Default
    Person(){
        this.a = 10;
    }

    // Parameter Constructor
    Person(int b){
        this.a = b; //  h2.a
    }

    Person(int b,boolean a){ //(23 true)
                             //a=23
        this.a = b;          //b=true
        this.b = a;
    }
}

public class IV1 {
    public static void main(String[] args) {

        Person h=new Person();
        System.out.println(h.a);

        Person h2=new Person(23);
        System.out.println(h2.a);

        Person h3=new Person(23,true);
//       System.out.println(h3.a);
//       System.out.println(h3.b);

        System.out.println(h.b); //value of boolean b i.e. by default it is false
        h.a=99;
        System.out.println(h.a);

    }
}




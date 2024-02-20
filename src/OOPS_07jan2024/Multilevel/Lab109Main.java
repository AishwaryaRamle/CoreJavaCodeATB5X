package src.OOPS_07jan2024.Multilevel;

public class Lab109Main {
    public static void main(String[] args) {
//        Grandfather g=new Grandfather();
//        Father f=new Father();
//        Son s=new Son();

//        Grandfather g =new Son();
//        g.bhk3();// can only access grandfather function using grandfather g refrence object.
            Father f=new Son();
//          Son s=new Grandfather();//son cant access Grandfather function through son refrence object.
//          Son s1=new Father();

        Grandfather g= new Son();
        g.bhk3();


        Son s= new Son();
        s.bhk3();
        s.bhk2();
        s.bhk1();
    }
}

package src.OOPS_13jan_2024.Interface.askInterviewQuestion;

public class II1 {
    public static void main(String[] args) {
        Hello h = new Hello();
        h.say();
        h.hello();

        II i = new Hello();
        i.hello();

    }
}
interface II{
    void say();
    default void hello(){
        System.out.println("Hello Default");
    }
}
interface p{

}

class Hello implements II {

    @Override
    public void say() {
        System.out.println("Say!!!");

    }

    @Override
    public void hello() {
        System.out.println("Hello OF hello");
       // II.super.hello();
    }
}
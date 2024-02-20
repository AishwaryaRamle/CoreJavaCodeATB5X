package src.OOPS_13jan_2024.AcessModifier.Police;

public class Jrcop {
    public static void main(String[] args) {
        Cop jrcop=new Cop(2);
        System.out.println(jrcop.gun);
        jrcop.printdetails();// able to call as it is present in same package and non subclass
        jrcop.canIShoot();//allowed because canIShoot is protected function(i.e.same package with different subclass)
    }
}

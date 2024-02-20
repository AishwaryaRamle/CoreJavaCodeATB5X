package src.OOPS_13jan_2024.Assignment.Inheritance.MultiLevel;

public class RC_Multilevel {
    public static void main(String[] args) {
        //Now when son is born it has both persons properties (i.e. GF and F)
        Son s=new Son();//All Methods can be called
        //Father f=new Father();//Only access fightBehavior and compare
        //GrandFather g=new GrandFather();//Only access fightBehavior
        //GrandFather g1=new Father();//only access fightBehavior
        //GrandFather g1=new Son();//only access fightBehavior
        //Father f1 =new Son();//Only access fightBehavior and compare
        //Father obj = new GrandFather();//Not possible as we try to create GF using F
        //Son obj = new Father();//Not possible as we try to create F using S
        //Son s1=new GrandFather();// Not possible as we try to create GF using S

        s.fightBehaviour();
        s.Compare();
        s.Calm();
    }
}

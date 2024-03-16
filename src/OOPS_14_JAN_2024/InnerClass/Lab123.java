package src.OOPS_14_JAN_2024.InnerClass;

public class Lab123 {
    public static void main(String[] args) {
        Gadgets g=new Gadgets();
        System.out.println("device count:"+g.device);
        g.making();
//        Gadgets.Laptop lp=g.new Laptop();  if class is public(e.g.class Laptop)
//        lp.model();

        Gadgets.Laptop lp1=new Gadgets.Laptop();
        lp1.model();


    }

}

//class Members
class Gadgets{
    int device=30;// Data Members / Instances Variables

    //Methods

    void making()
    {
        System.out.println("I am making method of Gadgets Class");
    }
    static class Laptop
    {
        void model(){
            System.out.println("Model Method of Laptop Class");
         //   System.out.println(device);
        }
    }
}


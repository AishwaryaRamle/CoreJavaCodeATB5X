package src.OOPS_14_JAN_2024.InnerClass;

public class Lab122 {
    public static void main(String[] args) {
        OOC ooc =new OOC();
        OOC.SNCI sn1=new OOC.SNCI();
        sn1.show();
    }
}
class OOC{
    static int o=100;
    int a=900;
     static class SNCI{
        void show()
        {
         //   System.out.println(a);
            System.out.println(o);
        }
    }

}

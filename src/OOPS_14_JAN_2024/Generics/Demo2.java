package src.OOPS_14_JAN_2024.Generics;

public class Demo2 {
    //String on use compare method ,if not used compare method will only able to use int and double method.
    //DT is custom class created.
    public static void main(String[] args) {
        System.out.println(maxThreeNumber(1,2,3));
        System.out.println(maxThreeNumber(1.0,2.2,3.3));
        System.out.println(maxThreeNumber('d','w','q'));
        System.out.println("Maximum of String is "+maxThreeNumber("aish","anya","ameya"));
    }

    public static <DT extends Comparable<DT>> DT maxThreeNumber(DT a, DT b, DT c)
    //  Generic class Diamond operator extend comparable class needed for string,return type-DT or void,int etc,DT-datatye
    {
        DT maximum=a;
        if(b.compareTo(maximum)>0)
        {
            maximum=b;
        }
        if(c.compareTo(maximum)>0)
        {
            maximum=c;
        }

        return maximum;

    }
}

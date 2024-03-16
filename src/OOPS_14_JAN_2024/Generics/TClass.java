package src.OOPS_14_JAN_2024.Generics;

public class TClass {
    //whole class is Generic
    public static void main(String[] args) {
        Test<Integer> i=new Test<Integer>(5);
        System.out.println(i.getObject());

        Test<Double> i1=new Test<Double>(5.2);
        System.out.println(i1.getObject());

        Test<String> i2=new Test<String>("Hello");
        System.out.println(i2.getObject());

        Test<Character> i3=new Test<Character>('A');
        System.out.println(i3.getObject());
    }
}

class Test <T>
{
T obj;
//datatype var_name;
    Test(T obj)
    {
        this.obj=obj;
    }
    public T getObject()
    {
        return obj;
    }
}

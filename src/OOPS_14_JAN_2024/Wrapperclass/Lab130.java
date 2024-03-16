package src.OOPS_14_JAN_2024.Wrapperclass;

public class Lab130 {
    public static void main(String[] args) {
        int a=10;
        //Integer a2=a; can change primitive datatype into Wrapper OR by using valueof() function of wrapper class

        Integer a2=Integer.valueOf(a);
        // wrapper class we use in collection framework


        // Collection Framework -> Class -> Hate primitive data type
        // You have to use the Wrapper classes in Collection.


        Character ch='a';
        // unboxing - Character object to primitive conversion
        char c=ch;

        System.out.println(Integer.valueOf("55"));
        System.out.println(Integer.max(34,54));
        System.out.println(Integer.max(34,54));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        double d=90.87;
        String str=String.valueOf(d);//conversion of double in String
        System.out.println(str);

        Integer in1=Integer.valueOf((int) d); //conversion of double integer wrapper using type casting
        System.out.println(in1);

        Double d1=Double.valueOf(d); //conversion of double in Double
        System.out.println("primitive double into Double wrapper class"+ d1);

        Integer in2= d1.intValue(); //Wrapper double is converted to Integer,
                                    // can convert into primitive datatype also int in2= d1.intValue();
        System.out.println(in2);

        Float f1=in1.floatValue();
        System.out.println(f1);








    }
}

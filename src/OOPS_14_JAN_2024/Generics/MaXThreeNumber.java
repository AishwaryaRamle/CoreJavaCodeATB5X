package src.OOPS_14_JAN_2024.Generics;

public class MaXThreeNumber {
    public static void main(String[] args) {
        //34,54,76--int
        //4.2,3.4,1.2--double
        //p,z,a---char

        int maxput=maximumNumberOf(34,56,76);
        System.out.println(maxput);

        double ip2=maximumNumberOfD(3.4,7.9,4.5);
        System.out.println(ip2);

        String ip3=maximumNumberOfS("a","b","c");
        System.out.println(ip3);
    }

    public static int maximumNumberOf(int a, int b, int c) {
        int max = a;
        if(b>max)
        {
            max=b;
        }
        if(c>max)
        {
            max=c;
        }
        return max;
    }
    public static double maximumNumberOfD(double a, double b, double c) {
        double max1 = a;
        if(b>max1)
        {
            max1=b;
        }
        if(c>max1)
        {
            max1=c;
        }
        return max1;
    }

    public static String maximumNumberOfS(String x, String y, String z) {
        String max2 = x;
        if(y.compareTo(max2)>0)
        {
            max2=y;
        }
        if(z.compareTo(max2)>0)
        {
            max2=z;
        }
        return max2;
    }


}

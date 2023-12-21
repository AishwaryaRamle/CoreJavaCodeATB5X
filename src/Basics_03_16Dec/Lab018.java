package src.Basics_03_16Dec;

public class Lab018 {
    public static void main(String[] args) {

        /*int course=100;
        float GST=0.1845f;
        int total =course +(int)GST*100;
        System.out.println(total); */ //o/p is showing as 100--->after decimal point values are not shown as datatype is that why
                                      // use bigger datatype for proper conversion type(e.g. either float or double instead of int)


        float course = 100;
        float GST = 18.45f;
        double total = course+ GST;
        System.out.println(total);

        //GST Value  calculation...
        double org_cost=100;
        double gst_cost=18.4598;
        double total_new =org_cost*18.45/100;
        System.out.println(total_new);


    }
}

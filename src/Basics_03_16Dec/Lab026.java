package src.Basics_03_16Dec;

public class Lab026 {
    public static void main(String[] args) {
        // Ternary operator.

        //int a =  condition ?  if this is true print do this :  If false do this
        int a= true ? 10 :20;

        int a1=(30>40) ?10:20;

        System.out.println(a);
        System.out.println(a1);

        String str = 10>30 ? "10": "TWENTY";
        System.out.println(str);

        String Marital_status =true ? "Married" :"unmarried";
        System.out.println(Marital_status);

        String anil_status = false ? "Yes" : "No";
        System.out.println(anil_status);


    }
}

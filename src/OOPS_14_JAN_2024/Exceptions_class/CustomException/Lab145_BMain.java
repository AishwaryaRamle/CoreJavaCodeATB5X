package src.OOPS_14_JAN_2024.Exceptions_class.CustomException;

public class Lab145_BMain {
    public static void main(String[] args) throws CustomException {
        Bank jpchase = new Bank("USD", 200);

        Bank hdfc = new Bank("INR", 100);
        Bank icici = new Bank("INR",100);


        System.out.println(hdfc.add(jpchase));
        //System.out.println(hdfc.add(icici));
        // Custom Exception



    }
}

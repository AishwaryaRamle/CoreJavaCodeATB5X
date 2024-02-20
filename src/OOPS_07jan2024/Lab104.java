package src.OOPS_07jan2024;

public class Lab104 {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount();
        sbi.printdetails();

        System.out.println("----- -----");

        BankAccount hdfc=new BankAccount("HDFC","hdfc0002");
        hdfc.printdetails();

        System.out.println("----- -----");

        BankAccount icici_ref = new BankAccount("ICIC","icici003");
        icici_ref.bankcode = "icici005";
        icici_ref.printdetails();

        System.out.println("----- -----");

        BankAccount yesbank_ref = new BankAccount("YES bANK","YES005");
        yesbank_ref.printdetails();



}
}


package src.OOPS_07jan2024;

public class BankAccount {
    String bankname;
    int balance;

    String bankcode;

    BankAccount()
    {
        bankname = "SBI";
        bankcode="SBI001";
        System.out.println("Default Constructor");
    }

    BankAccount(String bName,String bCode)
    {
        this.bankname=bName;
        this.bankcode=bCode;
        System.out.println("parametrized constructor");
    }
    void printdetails()
    {
        System.out.println("Bank name is---->"+ this.bankname);
        System.out.println("Bank name is---->"+ this.bankcode);
        System.out.println("Balance is ---->"+ balance);
    }
}

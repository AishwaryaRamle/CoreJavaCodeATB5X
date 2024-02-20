package src.OOPS_13jan_2024.Encapsulation.Example3;

public class ICICIBank {
    String name="Amu";
    long bal=5000;
//    public void printdetails()
//    {
//        System.out.println(name);
//        System.out.println(bal);
//    }

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal) {
        if (bal > 0) {
            this.bal = bal;
            System.out.println("Balance is "+this.bal);
        } else {
            System.out.println("Not allowed to set balance below zero!!!");
        }
    }


}

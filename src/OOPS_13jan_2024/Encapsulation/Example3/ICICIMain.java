package src.OOPS_13jan_2024.Encapsulation.Example3;

public class ICICIMain {
    public static void main(String[] args) {

        ICICIBank i = new ICICIBank("Aishwarya", 500);
       // i.printdetails();
        System.out.println("Name of account holder is " + i.getName() + " and has Account Balance " + i.getBal());
        i.setBal(1000);
        i.setName("Anya");
      // new set user name
     //   System.out.println("Name of account holder is " + i.getName() + " and has Account Balance " + i.getBal());


    }
}

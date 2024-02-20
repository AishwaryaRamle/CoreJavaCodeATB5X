package src.OOPS_13jan_2024.Encapsulation.Example4;

public class CredMain {
    public static void main(String[] args) {
//        Credentials c=new Credentials("aa","aa@gmail.com",456);   with parameterized constructor
         Credentials c=new Credentials();
          c.getName();
          c.getPassword();
          c.getEmail();
        System.out.println(c.toString());
        System.out.println();
        c.setName("Aishwarya");
        c.setpassword(123456);
        c.setEmail("aish@gmaiil.com");
        System.out.println(c.toString());


    }


}

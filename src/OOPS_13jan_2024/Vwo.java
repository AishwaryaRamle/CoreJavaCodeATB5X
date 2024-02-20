package src.OOPS_13jan_2024;

public class Vwo {
    public String username;
    public String password;
    public Vwo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    boolean isLoggedIn(String username,String password)
    {
        if(this.username.toLowerCase().equals(username)&&this.password.toLowerCase().equals(password))
        {
            System.out.println("Logged IN!!");
            return true;
        }
        else {
            System.out.println("Wrong");
            return false;
        }
    }
}


/*
Implementation with two class
package src.OOPS_13jan_2024.Encapsulation;

public class BadExample {
    public static void main(String[] args) {
        vwoLogin vwoLogin = new vwoLogin("admin", "admin");
        boolean check = vwoLogin.isLoggedIn("admin", "password");
        System.out.println(check);

    }

    static class vwoLogin { //here class need to specify static as this class is need to access by other class and also BadExample class is not closed
        public String username;
        public String password;

        public vwoLogin(String username, String password) {
            this.username = username;
            this.password = password;
        }

        boolean isLoggedIn(String username, String password) {
            if (this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password)) {
                System.out.println("Logged IN!!");
                return true;
            } else {
                System.out.println("Wrong");
                return false;
            }
        }
    }

}

*/

/*
Implementation with two class
package src.OOPS_13jan_2024.Encapsulation;

public class BadExample {
    public static void main(String[] args) {
        vwoLogin vwoLogin = new vwoLogin("admin", "admin");
        boolean check = vwoLogin.isLoggedIn("admin", "password");
        System.out.println(check);

    }
    }

    static class vwoLogin {
        public String username;
        public String password;

        public vwoLogin(String username, String password) {
            this.username = username;
            this.password = password;
        }

        boolean isLoggedIn(String username, String password) {
            if (this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password)) {
                System.out.println("Logged IN!!");
                return true;
            } else {
                System.out.println("Wrong");
                return false;
            }
        }
    }

}

*/


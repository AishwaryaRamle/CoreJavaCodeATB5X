package src.OOPS_13jan_2024.Encapsulation;

public class BadExample {

    public static void main(String[] args) {
        vwoLogin vwoLogin = new vwoLogin("admin", "admin");
        //admin admin

        boolean check = vwoLogin.isLoggedIn("admin", "password");
        vwoLogin.setUsername("admin");
        System.out.println(vwoLogin.getPassword()); // return password value from line number 6
        boolean check2 = vwoLogin.isLoggedIn("admin", "password");
        System.out.println(check2);
    }
}

    class vwoLogin {
        private String username;

        private String password;

        vwoLogin(String username, String password) {
            this.username = username;
            this.password = password;
        }
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

//        public void setPassword(String password) {
//            this.password = password;
//        }

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


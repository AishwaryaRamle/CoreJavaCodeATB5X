package src.OOPS_13jan_2024.Encapsulation;

public class GE_Lab112 {
    public static void main(String[] args) {
        // Hidden
        VwoLoginFixed vwoLogin = new VwoLoginFixed("admin", "admin");
        // Hidden

        boolean check = vwoLogin.isLoggedIn("admin","password");
        String u=vwoLogin.getUsername();
        //String p=vwoLogin.getPassword();
        //vwoLogin.password="bc";
        vwoLogin.setUsername("admin");
        System.out.println(u);
        System.out.println(check);


        //vwoLogin.pramod();


    }
}
    class VwoLoginFixed {


        private String username;
        private String password;

        public VwoLoginFixed(String u, String p) {
            this.username = u;
            this.password = p;
        }

        public String getUsername() {
            return username;
        }

        private void pramod() {
            System.out.println("I am private");
        }

        public void setUsername(String username) {
            this.username = username;
        }

        boolean isLoggedIn(String username, String password) {

            pramod();

            if (this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password)) {
                System.out.println("Logged IN!!");
                return true;
            } else {
                System.out.println("Wrong");
                return false;
            }
        }
    }


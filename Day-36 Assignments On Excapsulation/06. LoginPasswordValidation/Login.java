
/*
6\. Create a `Login` class where password must be at least 6 characters.
*/

public class Login {
    private String username;
    private String password;

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        if (password.length() >= 6) {
            this.password = password;
            System.out.println("Password set successfully");
        } else {
            System.out.println("Password must be at least 6 characters");
        }
    }

    public void login(String username, String password) {
        if (this.username.equals(username) && this.password != null && this.password.equals(password)) {
            System.out.println("Login successful, Welcome " + this.username);
        } else {
            System.out.println("Invalid username or password");
        }
    }

    public static void main(String[] args) {
        Login l1 = new Login();
        l1.setUsername("alex");

        l1.setPassword("abc");
        l1.setPassword("alex@123");

        System.out.println();

        l1.login("alex", "alex123");
        l1.login("alex", "alex@123");
    }
}

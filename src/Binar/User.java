package Binar;

public class User {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public static void main(String[] args) {
        User naufal = new User();

        naufal.setUsername("naufal");
        naufal.setPassword("123");

        System.out.println("Username: " +naufal.getUsername());
        System.out.println("Password: " +naufal.getPassword());
    }
}


package Oops;

public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.name = "Aditya";
        b1.setPassword("we can only change password / Set Password");

    }
}

class BankAccount {
    public String name;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}

package tp6.tp5;

public class BankAccount {
    private String username;
    private int id;
    private double balance;

    public BankAccount(String username, int id, double balance) {
        this.username = username;
        this.id = id;
        this.balance = balance;
    }

    public void deposit(double dep)
    {
         this.balance=dep+this.balance;

    }

    public void withdraw(double wd)
    {
        this.balance+=wd;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "username='" + username + '\'' +
                ", id=" + id +
                ", balance=" + balance +
                '}';
    }
}

package tp5;

public class BankAccount {
    public int id;
    public String username;
    public double balance;

    BankAccount(int id,String username){
        this.id=id;
        this.username = username;
        this.balance = 0;
    }

    public void deposit(double x){
        this.balance += x;
    }

    public void withdraw(double x){
        this.balance -= x;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", balance=" + balance +
                '}';
    }
}

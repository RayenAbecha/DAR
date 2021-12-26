package tp6.tp5;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements MyInterface {
    BankAccount account;
    public Server() throws RemoteException {}



    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();

        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }


    public void deposit(double x) {
        account.deposit(x);
        System.out.println(account);

    }


    public void createbk(String x, int y, double z) throws RemoteException {
     account = new BankAccount(x,y,z);
     System.out.println(account);
    }

    public void withdraw(double y) {
        account.withdraw(y);
        System.out.println(account);
    }
}

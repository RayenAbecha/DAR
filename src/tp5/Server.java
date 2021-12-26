package tp5;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements MyInterface {

    private BankAccount acc;

    public Server() throws RemoteException {}

    public String sayHello() {
        return "Hello World !!";
    }

    @Override
    public String upperCase(String ch) throws RemoteException {
        return ch.toUpperCase();
    }

    @Override
    public int index(String ch, char c) throws RemoteException {
        return ch.indexOf(c);
    }

    @Override
    public String palyndrome(String ch) throws RemoteException {
        int x=0;
        for(int i=0;i<ch.length()/2;i++){
            if((ch.charAt(i))!=(ch.charAt(ch.length()-i-1)))
                x++;
        }
        if (x==0)
            return "Palyndrome";
        else
            return "Pas palydrome";
    }

    @Override
    public void constructeur(int id, String username) throws RemoteException {
        acc = new BankAccount(id, username);
    }

    @Override
    public void deposit(double x) throws RemoteException {
        acc.deposit(x);
    }

    @Override
    public void withdraw(double x) throws RemoteException {
        acc.withdraw(x);
    }

    @Override
    public String tostring() {
        return acc.toString();
    }

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();

        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }
}

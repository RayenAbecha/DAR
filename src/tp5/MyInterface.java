package tp5;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {

    String sayHello()throws RemoteException;
    String upperCase(String ch) throws RemoteException;
    int index(String ch,char c) throws RemoteException;
    String palyndrome(String ch) throws  RemoteException;
    void constructeur(int id, String username) throws RemoteException;
    void deposit(double x) throws RemoteException;
    void withdraw(double x) throws RemoteException;
    String tostring() throws RemoteException;
}

package tp6.tp5;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {

    void deposit (double x) throws  RemoteException;
    void createbk (String x,int y,double z) throws  RemoteException;
    void withdraw(double y) throws  RemoteException;

}

package tp5;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {

    String retUp(String msg)throws  RemoteException;
    int existence(String msg,String c)throws  RemoteException;
    int palindrome(String msg)throws  RemoteException;
}

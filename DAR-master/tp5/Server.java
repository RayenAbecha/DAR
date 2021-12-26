package tp5;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements MyInterface {

    public Server() throws RemoteException {}




    public String retUp(String msg) throws RemoteException {
        return msg.toUpperCase();
    }

    public int existence(String msg, String c) throws RemoteException {
        int i = 0;

        while (i < msg.length()) {
            if (msg.charAt(i)==c.charAt(0))
                return i;
            else {
                i++;
            }
        }
        return -1;
    }


    public int palindrome(String message) throws RemoteException {
        String reverse ="";
        int length = message.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + message.charAt(i);

        if (message.equals(reverse))
            return 1;
        else
            return -1;
    }

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();

        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }
}

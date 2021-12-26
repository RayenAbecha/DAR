package tp4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    static final int port = 1200;

    public static void main(String[] args) throws Exception {

        // Listen to a specific port

        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Waiting for connection");
        Socket socClient = serverSocket.accept(); // Accept a client socket
        System.out.println("Connection established");

        // Initialize in / out
        BufferedReader inServer = new BufferedReader(new InputStreamReader(socClient.getInputStream()));
        PrintWriter outServer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socClient.getOutputStream())), true);

        //Scenario 1
        String str = inServer.readLine();
        str = str.toUpperCase();
        outServer.println(str);

        //Scenario 2
        String str2 = inServer.readLine();
        char c = inServer.readLine().charAt(0);
        outServer.println(str2.indexOf(c));

        //Scenario 3
        String str4 = inServer.readLine();
        int x=0;
        for(int i=0;i<str4.length()/2;i++){
            if((str4.charAt(i))!=(str4.charAt(str4.length()-i-1)))
                x++;
        }
        if (x==0)
            outServer.println("Palyndrome");
        else
            outServer.println("Pas palydrome");

        System.out.println("something");


        // ****** if you're using DataInputStream & DataOutputStream ******

        //DataInputStream inServer = new DataInputStream(socClient.getInputStream());
        //DataOutputStream outServer = new DataOutputStream(socClient.getOutputStream());

        // Read message sent by the client
        //String s = inServer.readUTF();
        //String strUpper = str.toUpperCase();
        //System.out.println("The msg was " + strUpper);

        // ****** if you're using DataInputStream & DataOutputStream ******

        // Close in / out
        inServer.close();
        outServer.close();

        // Close client socket
        socClient.close();
        serverSocket.close();
    }
}

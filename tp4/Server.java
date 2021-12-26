package tp4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Locale;
import java.lang.String;

public class Server {

    public static int  palindrome(String message)
    {
                String reverse ="";
                int length = message.length();

                for (int i = length - 1; i >= 0; i--)
                    reverse = reverse + message.charAt(i);

                if (message.equals(reverse))
                   return 1;
                else
                    return -1;

        }





    public static int existence(String msg, String c)
    {
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

        // Read message sent by the client
        String msg = inServer.readLine();
        //String c= inServer.readLine();
        // Write message to the client
        //outServer.println(x.toUpperCase());
        int x =palindrome(msg);
        outServer.println(x);


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

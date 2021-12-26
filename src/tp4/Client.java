package tp4;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    static final int port = 1200;

    public static void main(String[] args) throws Exception {

        System.out.println("connection request");

        //Create a client socket
        Socket socket = new Socket("127.0.0.1", port);
        System.out.println("Connection established");

        // create in / out
        BufferedReader inClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter outClient = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);

        //Scenario 1
        System.out.print("Enter your msg : ");
        String str = new Scanner(System.in).nextLine();
        // Write message to the server
        outClient.println(str);
        // Read a message from the server
        str = inClient.readLine();
        System.out.println("To uppercase : "+str);

        //Scenario 2
        System.out.println("enter a word :");
        String str2 = new Scanner(System.in).nextLine();
        outClient.println(str2);

        System.out.println("enter a character :");
        String str3 = new Scanner(System.in).nextLine();
        outClient.println(str3);

        String ind = inClient.readLine();
        System.out.println("index of "+str3+" in "+str2+" : "+ind);

        //Scenario 3
        System.out.println("enter a word palyndrome:");
        String str4 = new Scanner(System.in).nextLine();
        outClient.println(str4);
        System.out.println(inClient.readLine());

        //****** if you're using DataInputStream & DataOutputStream ******

        //DataInputStream inClient = new DataInputStream(socket.getInputStream());
        //DataOutputStream outClient = new DataOutputStream(socket.getOutputStream());

        //System.out.println("Enter your msg");
        //String str = new Scanner(System.in).nextLine();
        //outClient.writeUTF(str);
        //outClient.flush();

        //****** if you're using DataInputStream & DataOutputStream ******

        //close in / out
        inClient.close();
        outClient.close();

        // close client socket
        socket.close();
    }
}

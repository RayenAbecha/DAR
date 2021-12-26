package tp5;

import java.rmi.Naming;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try {
            MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            System.out.println(service1.sayHello());
            System.out.println("enter message lowercase :");
            String str = new Scanner(System.in).nextLine();
            System.out.println(service1.upperCase(str));
            System.out.println("enter a word :");
            String str2 = new Scanner(System.in).nextLine();
            System.out.println("enter a char :");
            String str3 = new Scanner(System.in).nextLine();
            System.out.println("index of "+str3+" in "+str2+" : "+service1.index(str2,str3.charAt(0)));
            System.out.println("enter a palyndrom :");
            String str4 = new Scanner(System.in).nextLine();
            System.out.println(service1.palyndrome(str4));
            String str5 = new Scanner(System.in).nextLine();
            int id = new Scanner(System.in).nextInt();
            service1.constructeur(24,"Asma");
            System.out.println(service1.tostring());
            service1.deposit(260);
            System.out.println(service1.tostring());
            service1.withdraw(130);
            System.out.println(service1.tostring());
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e);
        }
    }
}

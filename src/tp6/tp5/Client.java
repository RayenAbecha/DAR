package tp6.tp5;

import tp6.tp5.MyInterface;

import java.rmi.Naming;

public class Client {

    public static void main(String[] args) {

        try {

            MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            System.out.println("Account creation");
            service1.createbk("Bilel",0,200.0);
            System.out.println("Deposit money");
            service1.deposit(100.0);
            System.out.println("withdraw money");
            service1.withdraw(50.0);


        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e);
        }
    }
}

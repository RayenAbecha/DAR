package tp5;

import java.rmi.Naming;

public class Client {

    public static void main(String[] args) {
        try {
            MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            System.out.println("Output for uppcase function of bilel word");
            System.out.println(service1.retUp("bilel"));
            System.out.println("Output for existence function of l character in bilel word");
            System.out.println(service1.existence("bilel","l"));
            System.out.println("Output for palindrome function of aziza  word");
            System.out.println(service1.palindrome("aziza"));


        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e);
        }
    }
}

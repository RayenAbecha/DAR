package tp3.ex2;

public class StaticCounter {
    private static int counter = 0;

    // todo : implement me
    public synchronized static void increment() {
        counter++;
        System.out.println("Counter : "+counter+"\n");
        //increment counter and print it
    }
}

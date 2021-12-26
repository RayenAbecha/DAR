package tp3.ex2;

public class Main {

    // 1 - implement static counter and run it multiple times
    // is the output always correct ? if not correct it
    // 2 - implement my counter and run it multiple times
    // is the output always correct ? if not correct it

    public static void main(String[] args) {
        MyCounter myCounter = new MyCounter();
        MyThread t1 = new MyThread(myCounter);
        MyThread t2 = new MyThread(myCounter);

        t1.start();
        t2.start();
    }
}

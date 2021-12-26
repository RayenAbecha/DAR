package tp3.ex1;

public class Main {

    public static class Th1 extends Thread {
        public Th1() {}
        @Override
        public void run() {
            System.out.println("My thread is running");
        }
    }

    public static class Th2 implements Runnable {
        @Override
        public void run() {
            System.out.println("My thread is running");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Th1 th1 = new Th1();
        Thread th2 = new Thread(new Th2());

        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.println("It's over !!");
    }
}

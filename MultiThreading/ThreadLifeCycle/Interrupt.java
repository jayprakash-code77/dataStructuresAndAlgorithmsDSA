package dataStructuresAndAlgorithmsDSA.MultiThreading.ThreadLifeCycle;
class Th extends Thread {
    @Override
    public void run() {
        String n = Thread.currentThread().getName();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}


public class Interrupt {
    public static void main(String[] args) {
        Th t1 = new Th();
        Th t2 = new Th();
        Th t3 = new Th();

        t1.start();
        t1.interrupt();
    }
}

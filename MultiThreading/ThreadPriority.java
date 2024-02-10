package dataStructuresAndAlgorithmsDSA.MultiThreading;

class P extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        P t0 = new P();
        P t1 = new P();
        P t2 = new P();

        t1.setPriority(3);
        t2.setPriority(6);
        t0.setPriority(10);

        t0.start();
        t1.start();
        t2.start();


    }
}

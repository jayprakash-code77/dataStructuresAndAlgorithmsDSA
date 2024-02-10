package dataStructuresAndAlgorithmsDSA.MultiThreading.ThreadLifeCycle;

class Ch extends Thread {
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

public class IsAlive {
    public static void main(String[] args) {

        Ch t1 = new Ch();
        Ch t2 = new Ch();
        Ch t3 = new Ch();

        System.out.println(t1.isAlive()); // this will give "False"
        t1.start();
        System.out.println(t1.isAlive()); // this will give "True"
    }
}

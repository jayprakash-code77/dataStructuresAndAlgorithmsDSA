package dataStructuresAndAlgorithmsDSA.MultiThreading.ThreadLifeCycle;

/*
 * NOTES :- 1) Sleep() is a static method of Thread class which throws checked exception that is "InterruptedException". Sleep method is use to put the thread into temporory waiting state.
 */

// Example of "sleep() method"
class Check extends Thread {
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

/*
 * NOTE :- "join()" method is used to exicute a particular thread completely and
 * when that thread starts exicuting the rest all the threads stop till that
 * thread is exicuted completely. join() method gives the "InterruptedException"
 * exception.
 */
// example of " join() method "
class Join extends Thread {
    @Override
    public void run() {
        String n = Thread.currentThread().getName();
        for (int i = 0; i < 5; i++) {
            System.out.println(n);
            // Thread.sleep(1000);
        }
    }
}

public class SleepAnd_JoinMethods {
    public static void main(String[] args) throws InterruptedException { // this is a main thread

        // Example of "sleep() method"
        /*
         * Check t1 = new Check();
         * Check t2 = new Check();
         * Check t3 = new Check();
         * 
         * t1.start(); // this will be exicuted by "t" thread
         * t2.start(); // this will be exicuted by "t" thread
         * t3.start(); // this will be exicuted by "t" thread
         */

        // example of " join() method "
        /* */
        Join t1 = new Join();
        Join t2 = new Join();
        Join t3 = new Join();

        t2.start(); // this will be exicuted by "t" thread
        // using join() method
        try {
            t2.join();
        } catch (InterruptedException e) {
            // TODO: handle exception
            // System.out.println(e);
        }
        t1.start(); // this will be exicuted by "t" thread
        t3.start(); // this will be exicuted by "t" thread

    }
}

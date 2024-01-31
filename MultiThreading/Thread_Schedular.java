package dataStructuresAndAlgorithmsDSA.MultiThreading;


class A extends Thread{
    @Override
    // this will print the name of the "Threads"
    public void run() {
        // Stroing the name of the threads
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(name);
        }
    }
}


public class Thread_Schedular {
    public static void main(String[] args) {
        A t1 = new A();
        A t2 = new A();
        A t3 = new A();

        t1.setName("Thread first");
        t2.setName("Thread second");
        t3.setName("Thread third");

        t1.start();
        t2.start();
        t3.start();


        // this code wil be excuted by "Main thread"
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(name);
        }



        // This "Main method contains 4 Threads" >>>>>>>>>>>>>   Thread first, Thread second, Thread third.
    }
}

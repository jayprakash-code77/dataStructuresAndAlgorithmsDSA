package dataStructuresAndAlgorithmsDSA.MultiThreading.ThreadLifeCycle;

class College1 extends Thread{
    @Override
    public void run() {
        String s = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(s);
            Thread.yield();  // this will stop the "College1 thread after 1 printing" and it will let the other threads to exicute.
        }
    }
}


class College2 extends Thread{
    @Override
    public void run() {
        String s = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(s);
        }
    }
}

public class Yield_Method {
    public static void main(String[] args) {
        College1 t1 = new College1();
        College2 t2 = new College2();
  

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();


    }
}

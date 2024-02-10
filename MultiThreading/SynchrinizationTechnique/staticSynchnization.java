package dataStructuresAndAlgorithmsDSA.MultiThreading.SynchrinizationTechnique;

// First way to solve this problem
class Example extends Thread {
    static int Balance = 5000;
    static int Withdraw;

    Example(int Withdraw) {
        Example.Withdraw = Withdraw;
    }

    public static synchronized void withdraw() {
        String name = Thread.currentThread().getName();
        if (Withdraw <= Balance) {
            System.out.println(name + " withdrawn money.");
            Balance = Balance - Withdraw;
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    // override method
    @Override
    public void run() {
        withdraw();
    }
}

// Second way to solve this problem
class Exam extends Thread {
    static int Balance = 5000;
    int Withdraw;

    Exam(int Withdraw) {
        this.Withdraw = Withdraw;
    }

    // override method
    public void run() {
        synchronized (Exam.class) {
            String name = Thread.currentThread().getName();
            if (Withdraw <= Balance) {
                System.out.println(name + " withdrawn money.");
                Balance = Balance - Withdraw;
            } else {
                System.out.println("Insufficient Balance.");
            }
        }
    }
}

class staticSynchnization {
    public static void main(String[] args) {

        // when the method is not synchronized >>> below code will give currupted data
        // and if it is synchronized that it will show currupted data if the other
        // object of "Example class" is created and the reference is passed in the
        // thread constructor

        /*
         * // First way to solve this problem
         * // 1st object of "example class"
         * Example e1 = new Example(5000);
         * Thread t1 = new Thread(e1);
         * Thread t2 = new Thread(e1);
         * t1.setName("Jayprakash(e1)");
         * t2.setName("Raju(e1)");
         * 
         * t1.start();
         * t2.start();
         * 
         * // 2nd object of "example class"
         * Example e2 = new Example(5000);
         * Thread t3 = new Thread(e2);
         * Thread t4 = new Thread(e2);
         * t3.setName("Neha(e2)");
         * t4.setName("Rani(e2)");
         * 
         * t3.start();
         * t4.start();
         */

        // Second way to solve this problem
        // 1st object of "exam class"
        Exam e1 = new Exam(5000);
        Thread t1 = new Thread(e1);
        Thread t2 = new Thread(e1);
        t1.setName("Jayprakash(e1)");
        t2.setName("Raju(e1)");

        t1.start();
        t2.start();

        // 2nd object of "exam class"
        Exam e2 = new Exam(5000);
        Thread t3 = new Thread(e2);
        Thread t4 = new Thread(e2);
        t3.setName("Neha(e2)");
        t4.setName("Rani(e2)");

        t3.start();
        t4.start();

    }
}

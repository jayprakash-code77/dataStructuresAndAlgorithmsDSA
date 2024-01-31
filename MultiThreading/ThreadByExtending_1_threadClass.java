package dataStructuresAndAlgorithmsDSA.MultiThreading;

class BasicCalculation extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 7; i++) {
                System.out.println("Maurya");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

public class ThreadByExtending_1_threadClass {
    public static void main(String[] args) throws InterruptedException { // in this line "main is also a thread"
        BasicCalculation th = new BasicCalculation();
        th.start(); // this thread will run only the code present in the "run() fo BasicCalculation
                    // class"

        // this all down work will be exicuted by "main thread"
        for (int i = 0; i < 7; i++) {
            System.out.println("Jayprakash");
            Thread.sleep(1000);
        }
    }
}

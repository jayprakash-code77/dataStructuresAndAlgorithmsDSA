package dataStructuresAndAlgorithmsDSA.MultiThreading;


class Check implements Runnable {

    @Override
    public void run() {
        // handling the exceptions
        try {
            for (int i = 0; i < 7; i++) {
                System.out.println("Maurya");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        
    }
}

public class ThreadByImplementing_2_RunnableInterface {
    public static void main(String[] args) throws InterruptedException{
        // Create object of "Check class"
        Check c= new Check();
        // Create object of "Thread class present in the Collection by importing it"
        Thread t = new Thread(c);  // here we will pass the object of the "Check class which implements the runnable interface"
        // Now we can use the "start() method to exicute the run() method present in the Check class"
        t.start();

        for (int i = 0; i < 7; i++) {
            System.out.println("Jayprakash");
            Thread.sleep(1000);
        }

    }
}

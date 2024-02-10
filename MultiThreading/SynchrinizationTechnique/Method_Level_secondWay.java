package dataStructuresAndAlgorithmsDSA.MultiThreading.SynchrinizationTechnique;

/**
 * Method_Level_secondWay
 */
public class Method_Level_secondWay extends Thread{
    private static int amount = 5000;

    @Override
    public void run() {

        synchronized(Method_Level_secondWay.class) {
            if (amount <= 0) {
                System.out.println("No amount");
            } else {
                System.out.println("5000 removed.");
                amount = amount - 5000;
            }
        }
    }

    public static void main(String[] args) {
        Method_Level_secondWay v1 = new Method_Level_secondWay();
        Method_Level_secondWay v2 = new Method_Level_secondWay();
        Method_Level_secondWay v3 = new Method_Level_secondWay();
        v1.start();
        v2.start();
        v3.start();


    }
}
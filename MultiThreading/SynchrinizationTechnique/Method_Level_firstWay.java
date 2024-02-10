package dataStructuresAndAlgorithmsDSA.MultiThreading.SynchrinizationTechnique;

/*  <>>>>>>>>>>>>>>>>>>>>>>Explanation for the "Test" class
 * In the provided code snippet, the `amount` variable is declared as `private static int amount = 5000;`. Let's break down the reasons why `static` is necessary in this context:

1. **Static context within a class extending Thread**: Since the class `Test` extends `Thread`, if `amount` were not static, each instance of `Test` would have its own copy of the `amount` variable. However, in this scenario, you want all instances of `Test` to share the same `amount` variable. Declaring `amount` as `static` ensures that there is only one instance of `amount` shared among all instances of the `Test` class.

2. **Synchronization on class level**: In the `run` method, `synchronized(Test.class)` is used to synchronize access to the critical section of code. When synchronizing on a class object, it ensures that only one thread can access that synchronized block across all instances of the class. For this synchronization to work effectively, `amount` needs to be `static` so that all instances of `Test` share the same `amount` variable and the synchronization is applied uniformly across all instances.

If `amount` were not `static`, each instance of `Test` would have its own copy of `amount`, and synchronization on `Test.class` would not effectively control access to the shared `amount` variable across all instances of `Test`. Thus, making `amount` static ensures that all instances of `Test` share the same variable, allowing synchronization to work correctly.
 */
class Test extends Thread {
    private static int amount = 10000; // Shared variable representing the amount

    @Override
    public void run() {
        // Synchronization block to ensure thread safety
        synchronized (Test.class) {
            // storing the name of thread
            String n = Thread.currentThread().getName();
            // Check if there's enough amount to deduct
            if (amount <= 0) {
                System.out.println("No amount"); // Print message if no amount is available
            } else {
                System.out.println("5000 removed by "+n); // Print message indicating amount deduction
                amount = amount - 5000; // Deduct 5000 from the shared amount
            }
        }
    }
}

// Method level synchronization
class secondTest implements Runnable {

    private int amount = 5000;

    public synchronized void run() {

        if (amount <= 0) {
            System.out.println("No amount");
        } else {
            System.out.println("5000 removed.");
            amount = amount - 5000;
        }

    }
}

public class Method_Level_firstWay {
    public static void main(String[] args) {
        // "Test" class example

        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();

        t1.start();
        t2.start();
        t3.start();

        // "secondTest" class Example

        // secondTest h = new secondTest();
        // Thread th1 = new Thread(h);
        // Thread th2 = new Thread(h);
        // Thread th3 = new Thread(h);

        // th1.start();
        // th2.start();
        // th3.start();

    }
}

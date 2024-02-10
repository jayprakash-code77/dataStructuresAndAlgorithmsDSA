package dataStructuresAndAlgorithmsDSA.MultiThreading.SynchrinizationTechnique;

class msg {
    public void show(String name) {

        ;;;;;; // 100 lines of code
        
        synchronized(this) {     // if you want to see the main  perpose of this code than make this "Synchronized" code "Unsynchronized"
            for (int i = 0; i < 4; i++) {
                System.out.println("How are you "+name);
            }
        }

        ;;;;;; // 100 lines of code 
    }
}

class threadMain extends Thread{
    msg m; //reference of "msg" class
    String name;

    threadMain(msg m, String name) {
        this.m = m;
        this.name = name;
    }

    @Override
    public void run() {
        m.show(name);
    }
}


public class Block_Level {
    public static void main(String[] args) {
        msg m = new msg();
        threadMain t1 = new threadMain(m, "Jayprakash");
        threadMain t2 = new threadMain(m, "Raju");
        threadMain t3 = new threadMain(m, "Sweta");

        t1.start();
        t2.start();
        t3.start();


    }
}

package dataStructuresAndAlgorithmsDSA.DesignPatterns;



// Singleton pattern

// >>>>>>>>>>>>>>>>>   this class will not handle the multiple threads so we have to make the "synchronized" block
class Singleton {
    // instance of "Singleton class";
    private static Singleton instance;
    // attributes of Singleton class
    private String data;
    private String userName;

    // creates constructor to make the object of this class (Note:- the access level
    // of the constructor is "private")
    private Singleton(String Data) {
        // initialize all the variables or fields we are having.
        this.data = Data;
    }

    // method to get the instance of this class
    public static Singleton getInstance(String data) {
        // corner case >>> if we are not having any instance of the class than we will
        // mae the instance and store it in "instance variable" and we will return it
        // every time.
        if (instance == null) {
            instance = new Singleton(data);
            return instance;
        }

        // return the stored instance
        return instance;
    }
}

// >>>>>>>>>>>>>> this class will handle the multiple threads due to
// "synchronized" block

class Singleton_withSynch {
    // instance of "Singleton class";
    private static Singleton_withSynch instance1;
    // attributes of Singleton class
    private String data;
    private String userName;

    // creates constructor to make the object of this class (Note:- the access level
    // of the constructor is "private")
    private Singleton_withSynch(String Data) {
        // initialize all the variables or fields we are having.
        this.data = Data;
    }

    // method to get the instance of this class
    public static Singleton_withSynch getInstance(String data) {

        // synchronized block
        if (instance1 == null) { // this is an example of "Double-Checked Locking idiom". >>>>>>>>>>>>>>>>>>>
                                 // IMPORTANT >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
            synchronized (Singleton_withSynch.class) {
                // corner case >>> if we are not having any instance of the class than we will
                // make the instance and store it in "instance1 variable" and we will return it
                // every time.
                if (instance1 == null) {
                    instance1 = new Singleton_withSynch(data);
                }
            }
        }

        // return the stored instance
        return instance1;
    }
}

class Singleton_MostEfficientCode {
    private static volatile Singleton_MostEfficientCode instance2; // we are using volatile which is the only change in
                                                                   // the code which is really important
    // all the fields
    private String data;

    // creating the private constructor
    private Singleton_MostEfficientCode(String data) {
        // initialize all the variables or fields we are having.
        this.data = data;
    }

    // method to get the instance of this class
    public static Singleton_MostEfficientCode getInstance(String data) {
        Singleton_MostEfficientCode result = instance2;
        if (result == null) {// this is an example of "Double-Checked Locking idiom". >>>>>>>>>>>>>>>>>>>
                             // IMPORTANT >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
            synchronized (Singleton_MostEfficientCode.class) {
                result = instance2;
                if (result == null) {
                    instance2 = result = new Singleton_MostEfficientCode(data); // IMPORTANT
                                                                                // >>>>>>>>>>>>>>>>>>>>>>>>>>>>
                }
            }
        }
        return result;
    }
}

public class SingletonPattern {
    public static void main(String[] args) {
        Singleton_MostEfficientCode in = Singleton_MostEfficientCode.getInstance("Jay");
        Singleton_MostEfficientCode in2 = Singleton_MostEfficientCode.getInstance("Prakash");

    }
}

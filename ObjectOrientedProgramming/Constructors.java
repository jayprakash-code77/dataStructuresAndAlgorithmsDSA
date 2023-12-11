package dataStructuresAndAlgorithmsDSA.ObjectOrientedProgramming;

/*
 * Constructors:- Used to construct the object of class.
 * Properties of Constructors:- 1) Constructor must have the same name as class name. 2) Constructors does not return anything and they don't have any return type. 3) Constructors are called only once for one object. 
 * Type of Constructors:- 1) Non paramiterized constructors:- No parameters
                          2) Paramiterized constructors:- Have parameters
                          3) Copy Constructors:- Copies one object and puts it in the other object
 */

// Student class 
class Student {
    String name;// property 1
    int age;// property 2
    // function to print information

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Non-paramiterized constructor
    /*
     * Student (){
     * System.out.println("Constructor Called !!!");
     * }
     */

    // Paramiterized constructor
    /*
     * Student(String name, int age){
     * this.age=age;
     * this.name=name;
     * }
     */

    // Copy Constructors
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    // This constructor is just to make consctructors which are not copy
    // constructor.
    Student() {

    }

}

public class Constructors {
    public static void main(String[] args) {

        // Example of Non-paramiterized constructor
        /*
         * Student s1=new Student();
         * s1.name="Jay";
         * s1.age=19;
         * // calling printInfo(); fuction
         * s1.printInfo();
         */

        // Example of Paramiterized constructor
        /*
         * Student s2=new Student("Jay", 19);
         * s2.printInfo();
         */

        // Example of Copy Constructor
        Student s3 = new Student();
        s3.name = "Raju";
        s3.age = 20;
        // Info of "s3" object is copied to "s4" by using "Copy Constructors".
        Student s4 = new Student(s3);
        s4.printInfo();
    }
}

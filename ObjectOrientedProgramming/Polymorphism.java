package dataStructuresAndAlgorithmsDSA.ObjectOrientedProgramming;

/*
 * Polymorphism :- Using one method for many work for with different parameters.
 * Polymorphisms are of two type:- 1) Method overloading(Compile time polymorphism) 2) Method overriding(Run time polymorphism).
 */

class Poly {
    String name;
    int age;
    int password;
    String userID;

    // methods overloading (Compile time polymorphism)
    /*
     * Method overloading ca be done
     */

    public void printbasicInfo(String name, int age) {
        System.out.println(name + " " + age);
    }

    public void printbasicInfo(int password) {
        System.out.println(password);
    }

    public String printbasicInfo(String userid) {
        return userid;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Poly p = new Poly();
        System.out.println(p.printbasicInfo("Jay223"));
    }
}

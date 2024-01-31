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
     * Method overloading can be done by followinf these rules :- You must not have arguments of same Datatype and if the Datatype of arguments is same than you must not have the same number of arguments.
    The overloading can also be done by changing the sequence of arguments, of different Datatypes.
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

public class Polymorphism_lecture2 {
    public static void main(String[] args) {
        Poly p = new Poly();
        System.out.println(p.printbasicInfo("Jay223"));
    }
}

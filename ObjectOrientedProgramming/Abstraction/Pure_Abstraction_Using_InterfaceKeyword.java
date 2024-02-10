package dataStructuresAndAlgorithmsDSA.ObjectOrientedProgramming.Abstraction;

import java.util.*;

/**
 * InnerPure_Abstraction
 */
interface Client {
    void input();

    void output();

}

class Jayprakash implements Client {
    private String name;
    private double Salary;

    // method to take input
    @Override
    public void input() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name :");
        name = s.nextLine();
        System.out.println("Enter salary :");
        Salary = s.nextDouble();
        s.close();
    }

    // method to give output
    @Override
    public void output() {
        System.out.println("Name: " + name + " Salary: " + Salary);
    }
}

public class Pure_Abstraction_Using_InterfaceKeyword {
    public static void main(String[] args) {
        Client c = new Jayprakash();
        c.input();
        c.output();
    }

}

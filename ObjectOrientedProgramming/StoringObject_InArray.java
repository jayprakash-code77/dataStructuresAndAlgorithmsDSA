package dataStructuresAndAlgorithmsDSA.ObjectOrientedProgramming;
import java.util.*;
class Students{
    public String name;
    public int age;
}

public class StoringObject_InArray {
    public static void main(String[] args) {
        
        // storing object in array.
        Scanner sc=new Scanner(System.in);
        Students[] s1 = new Students[3];

        Students ob1 = new Students();
        Students ob2 = new Students();

        s1[0] = ob1;
        s1[1]= ob2;
        s1[0].name="jay";
        s1[0].age=18;
        System.out.println(s1[0].age);
        System.out.println(s1[0].name);
    }
}

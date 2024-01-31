package dataStructuresAndAlgorithmsDSA.ObjectOrientedProgramming;
import java.util.*;
class Student{
    public String name;
    public int age;
}

public class StoringObject_InArray {
    public static void main(String[] args) {
        
        // storing object in array.
        Scanner sc=new Scanner(System.in);
        Student[] s1 = new Student[3];
           
        Student ob1 = new Student();
        Student ob2 = new Student();

        s1[0] = ob1;
        s1[1]= ob2;
        s1[0].name="jay";
        s1[0].age=18;
        System.out.println(s1[0].age);
        System.out.println(s1[0].name);
    }
}

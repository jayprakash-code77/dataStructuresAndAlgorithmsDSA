package dataStructuresAndAlgorithmsDSA.ObjectOrientedProgramming.Abstraction;

// This is a abstract class 
abstract class Animal {
    abstract public void walk();
}

class Hosre extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walk on 2 legs");
    }
}

public class Abstraction_UsingKeyword {
    public static void main(String[] args) {

        Hosre h = new Hosre();
        h.walk();

        // this will show runtime error
        Animal a= new Animal() {
            @Override
            public void walk() {
                System.out.println("Made changes");
            }
        };

        a.walk();
    }
}

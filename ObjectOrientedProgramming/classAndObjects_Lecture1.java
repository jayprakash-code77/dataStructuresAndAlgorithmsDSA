package dataStructuresAndAlgorithmsDSA.ObjectOrientedProgramming;

/*
 * (this keyword):- this keyword tell's the "Functon" Or "Properties" that which object is "Calling" OR trying to "Access".
 * 
 */

// Pen Class 
class Pen {
    // type of pen(property 1 of class )
    String type;
    // type of color(property 2 of class )
    String Color;

    // print color of pen
    public void printColor() {
        System.out.println(this.Color);
    }

    // print type of pen
    public void printType() {
        System.out.println(this.type);
    }
}

// Main class
public class classAndObjects_Lecture1 {
    public static void main(String[] args) {
        // Make objects of the pen class
        // object 1
        Pen pen1 = new Pen();
        pen1.Color = "Red";
        pen1.type = "Gel";
        System.out.println(pen1.Color);
        System.out.println(pen1.type);
        // object 2
        Pen pen2 = new Pen();
        pen2.Color = "Black";
        pen2.type = "BallPoint";
        pen2.printColor();
        pen2.printType();

    }
}
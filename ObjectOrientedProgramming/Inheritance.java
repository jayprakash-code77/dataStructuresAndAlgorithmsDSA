package dataStructuresAndAlgorithmsDSA.ObjectOrientedProgramming;

/*
 * Inheritance (extends) giving all properties of the existing class to new made class.
 */

// Parrent class OR Base class
class Shape {
    String color;
}

// Sub class OR Child class
class Triangle extends Shape {

}

// Typr of Inheritance :-

// 1) Single level Inheritance
class Fruit {
    String fruitColor;
}

class Apple {
    String fruitName;
}

// 2) Multi level Inheritance
class School {
    String HeadStaff;
}

class classes extends School {
    String classTeacher;
}

class Moniters extends classes {
    String moniterName;
}

// 3) Hierarchial Inheritance
class College {
    String collegeName;
    int CollegeID;
    String owernerOfCollege;
}

// science department (extends College class)
class ScienceDepartment extends College {
    String headOfScienceDepartment;
}

// Art department(extends College class)
class ArtDepartment extends College {
    String headOfArtDepartment;

}

// 4) Hybrid Inheritance

// 5) Multiple Inheritance (Impemented using "Interfaces")

public class Inheritance {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.color = "Red"; // triangle class has the color perperty which is due to inheritance.

    }
}

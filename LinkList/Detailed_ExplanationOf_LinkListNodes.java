package dataStructuresAndAlgorithmsDSA.LinkList;

class Ok {
    String data; // This line declares an instance variable named data of type String. This
                 // variable is used to store a string of data.

    Ok next; // This line declares another instance variable named 'next' of type 'Ok'. The
             // variable 'next' is a reference to the next object of the same type (ok). This
             // indicates that instances of this class can be linked together in a chain.
}

/*
 * Explanation:-
 * The ok class is designed to represent a node in a linked list. A linked list
 * is a data structure where each element (node) contains data and a reference
 * to the next element in the sequence.
 * In this case, each ok object has two properties:
 * data: A String variable to store some data.
 * next: A reference to the next ok object in the sequence.
 * By using the ok class and linking objects through the next reference, you can
 * create a linked list where each node contains some data and points to the
 * next node in the list.
 */

public class Detailed_ExplanationOf_LinkListNodes {
    public static void main(String[] args) {

        // Create a new instance of the 'ok' class and assign it to the variable 'node1'
        Ok node1 = new Ok();

        // Set the 'data' property of 'node1' to the string "Hello"
        node1.data = "Hello";

        // Create another instance of the 'ok' class and assign it to the variable
        // 'node2'
        Ok node2 = new Ok();
        // Set the 'data' property of 'node2' to the string "World"
        node2.data = "World";

        // Link 'node1' to 'node2' by setting the 'next' property of 'node1' to
        // reference 'node2'
        node1.next = node2;

        // Create another instance of the 'ok' class and assign it to the variable
        // 'node3'
        Ok node3 = new Ok();

        // Set the 'data' property of 'node3' to the string "with"
        node3.data = "with";

        // Link 'node2' to 'node3' by setting the 'next' property of 'node2' to
        // reference 'node3'
        node2.next = node3;

        System.out.println(node1.next); // this is a "Head" of link list // this will have the address of node2.
        System.out.println(node2.next); // this will have the address of nade3
        System.out.println(node3.next); // this will point to "null"
    }
}

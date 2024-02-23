package dataStructuresAndAlgorithmsDSA.LinkList;

public class LinkList_Add_Concepts {
    Node head;
    private int size;

    // Node class
    class Node { //
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Operations of LinkList

    // 1) Add :- Two types of adding in LinkList a)Add first b)Add last

    // a)Add first
    public void addFirst(String data) {
        Node newNode = new Node(data); // this "newNode" will have different address and the "next" of this object will
                                       // have null reference.
        if (head == null) {
            head = newNode; // here first node will be created, which will have "next = null"
            return;
        }

        newNode.next = head; // here, first the "next of newNode will be assigned the reference of head" and
                             // than the reference of the newNode will be assigned to the head. This will
                             // store the reference of previous node in the newNode which is created.
        head = newNode;
    }

    // b)Add last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // print the LinkList
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        /*
         * Time complexity of insertion in LinkList is O(1).
         * Time complexity of search is O(n).
         * Variable size
         * non-contineous memory
         */

        /*
         * The LinkList is made of "nodes" and nodes store 2 values. 1)Data 2)next(store
         * the reference of the next node).
         * The first node is called the "Head" node and last node is called tail of
         * linkList.
         * Type of LinkList:- 1) Singular LinkList 2) Double LinkList 3) Circular
         * LinkList.
         */

        LinkList_Add_Concepts list = new LinkList_Add_Concepts();
        // Operations of LinkList

        // 1) Add :- Two types of adding in LinkList a)Add first b)Add last
        // a)Add first
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        System.out.println();
        list.addLast("list");
        list.printList();

        System.out.println();
        list.addFirst("This");
        list.printList();

    }
}

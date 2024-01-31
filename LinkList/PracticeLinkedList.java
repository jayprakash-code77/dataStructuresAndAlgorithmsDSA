package dataStructuresAndAlgorithmsDSA.LinkList;

public class PracticeLinkedList {

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
    }

    // print list
    public void printList() {
        if (head == null) {
            System.out.println("empty");
            return;
        }

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    void fun(Node head) {
        if (head == null)
            return;
        System.out.print(head.data);

        if (head.next != null)
            fun(head.next.next);
        System.out.print(head.data);
    }

    public static void main(String[] args) {
        PracticeLinkedList p = new PracticeLinkedList();
        p.addLast(1);
        p.addLast(2);
        p.addLast(3);
        p.addLast(4);
        p.addLast(5);
        p.addLast(6);

        p.fun(p.head);

    }
}

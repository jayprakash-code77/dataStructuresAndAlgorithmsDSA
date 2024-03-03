package dataStructuresAndAlgorithmsDSA.LinkList;

public class find_OR_delete_NthNodeFromLast {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // add first
    public void addFirst(int Data) {
        Node newNode = new Node(Data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // print list
    public void printList() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // Delete OR Find the Nth Node from last of LinkList
    public Node removeORfind_NthNode(Node head, int n) {
        if (head.next == null) {
            return null;
        }

        // find size of LinkList
        Node curr = head;
        int size = 0;
        while (curr.next != null) {
            size++;
            curr = curr.next;
        }

        if (n == size) {
            return head.next;
        }

        //
        int indexToSearch = size - n;
        Node previous = head;
        int i = 1;
        while (i < indexToSearch) {
            previous = previous.next;
            i++;
        }

        previous.next = previous.next.next;

        // return
        return head;
    }

    public static void main(String[] args) {
        find_OR_delete_NthNodeFromLast list = new find_OR_delete_NthNodeFromLast();

        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(5);
        list.addFirst(6);
        list.printList();

        // removeORfind_NthNode() function
        list.removeORfind_NthNode(list.head, 0);
        list.printList();
    }

}

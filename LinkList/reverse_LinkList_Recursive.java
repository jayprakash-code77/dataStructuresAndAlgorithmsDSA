package dataStructuresAndAlgorithmsDSA.LinkList;

public class reverse_LinkList_Recursive {
    Node head;

    class Node{
        Node next;
        String data;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }


    // addlast 
    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node secondLastNode = head;
        while (secondLastNode.next != null) {
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = newNode;
    }

    // print List
    public void printLinkedList(){
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data +" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }


    // reverse LinkList by Recursive method

    public Node reverseRecursive(Node head) {
        // base case
        if (head == null || head.next == null) {
            return head;
        }

        // recursive call
        Node newNode = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        // return head of reversed LinkList
        return newNode;
    }
    

    public static void main(String[] args) {
        reverse_LinkList_Recursive list = new reverse_LinkList_Recursive();
        list.addLast("I ");
        list.addLast("am ");
        list.addLast("Jayprakash");
        list.printLinkedList();
        list.head = list.reverseRecursive(list.head);
        list.printLinkedList();
    }

}

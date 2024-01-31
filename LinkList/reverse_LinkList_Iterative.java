package dataStructuresAndAlgorithmsDSA.LinkList;

public class reverse_LinkList_Iterative {
    // this will be the head of every LinkList that we create
    Node head;

    // Node class
     class Node{
        Node next;
        String data;

        Node(String data){
            this.data = data;
            this.next = null;
        }
     }
      

    //  add Last 
    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node secondLast = head;
        while (secondLast.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = newNode;
    }

    // print list
    public void printList(){
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


    // reverse LinkList by Iterative method 
    
    public void ReverseIterative(){
        if (head == null || head.next == null) {
            return;
        }

        Node previousNode = head;
        Node currentNode = head.next;

        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = previousNode;
            
            // update
            previousNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = previousNode;
    }

    public static void main(String[] args) {
        reverse_LinkList_Iterative list = new reverse_LinkList_Iterative();

        list.addLast("I ");
        list.printList();
        list.addLast("am ");
        list.addLast("Jayprakash");
        list.printList();
        list.ReverseIterative();
        list.printList();

    }
}

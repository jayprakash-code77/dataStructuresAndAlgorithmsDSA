package dataStructuresAndAlgorithmsDSA.LinkList;

public class linkList_Ispallindrome {
     Node head;
     class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
     }



    //  add last 
    public void addLast(int data){
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
            System.out.print(curr.data +" -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }





    

    public boolean isPalindrome(Node head) {
        // corner case
        if (head == null || head.next == null) {
            return true;
        }

        Node middle = findMiddle(head);
        Node secondHalfStart = reverse(middle.next);

        Node firstHalfStart = head;
        while (secondHalfStart != null) {
            if (firstHalfStart.data != secondHalfStart.data) {
                return false;
            }

            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }

        return true;
    }
    // function to find the middle node of the linklist 
    public Node findMiddle(Node head) {
        Node hare = head;
        Node turtle = head;  

        while ( hare.next != null && hare.next.next != null ) {
            hare = hare.next.next;
            turtle = turtle.next;
        }

        // return 
        return turtle;
    }
    // reverse function of linklist
    public Node reverse(Node head) {
        Node pre = null;
        Node curr = head;

        while (curr != null ) {
            Node next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        return pre;
    }
    

    public static void main(String[] args) {
        linkList_Ispallindrome list = new linkList_Ispallindrome();

        list.addLast(1);
        list.addLast(2);
        list.addLast(1);
        list.printList();

        // this will check weather the list is palindrome or not
        System.out.println(list.isPalindrome(list.head));


    }
     
}

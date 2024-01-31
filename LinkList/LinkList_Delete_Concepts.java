package dataStructuresAndAlgorithmsDSA.LinkList;

public class LinkList_Delete_Concepts {
    Node head;
    private int size;

    // initialising size a 'Zero'
    LinkList_Delete_Concepts(){
        this.size = 0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;   // this will increase when new "Node will be created "
        }
    }

    // add first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add last 
    public void addLast(String data){
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

    // print list
    public void printList(){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }




    // delete first
    public void deleteFirst(){
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // decreamenting the size while deleting the elements of LinkList
        size--;

        // first way to do 
        /*
        Node newNode = head;
        head = newNode.next;
        */
        // second way to do
        head = head.next;
    }



    // delete last 
    public void deleteLast(){
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // decrementing the size while deleting the elements of LinkList
        size--;

        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node last = head.next;
        while (last.next != null) {
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }


    
    public static void main(String[] args) {
        LinkList_Delete_Concepts list = new LinkList_Delete_Concepts();

        // add first
        list.addFirst("I ");
        list.addFirst("have ");
        list.addFirst("implemented ");

        // add last
        list.addLast("LinkList.");
        list.printList();

        // delete first
        list.deleteFirst();
        list.printList();
        
        // delete last
        list.deleteLast();
        list.printList();

        // size od LinkList
        System.out.println(list.getSize());
        list.addLast(" adding the LinkList again.");
        System.out.println(list.getSize());


    }
}

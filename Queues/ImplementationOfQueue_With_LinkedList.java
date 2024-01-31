package dataStructuresAndAlgorithmsDSA.Queues;

public class ImplementationOfQueue_With_LinkedList {
    // Nod eclass
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    class Queue {
        private Node head = null;
        private Node tail = null;

        // public function of Queue class

        // isEmpty() function
        public boolean isEmpty() {
            return head == null && tail == null;
        }

        // add() function of Queue
        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null && tail == null) {
                head = newNode;
                tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;

        }

        // remove() function
        public int remove() {
            // 1st Corner case
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            // 2nd corner case
            if (head == tail) {
                tail = null;
            }

            // returning head.data
            int result = head.data;
            head = head.next;
            return result;
        }

        // peek() function
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        ImplementationOfQueue_With_LinkedList h = new ImplementationOfQueue_With_LinkedList();
        ImplementationOfQueue_With_LinkedList.Queue q = h.new Queue();
        

        
        

    }
}

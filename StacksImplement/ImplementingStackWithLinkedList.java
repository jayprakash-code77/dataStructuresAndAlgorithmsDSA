package dataStructuresAndAlgorithmsDSA.StacksImplement;

public class ImplementingStackWithLinkedList {

    static class Node {

        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
        public Node head;
        private int size;

        public Stack() {
            this.head = null;
            size = 0;
        }

        // isEmpty function
        public boolean isEmpty() {
            return head == null;
        }

        // push() function
        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                size++;
                return;
            }
            newNode.next = head;
            head = newNode;
            size++;
        }

        // pop() function
        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int ans = head.data;
            head = head.next;
            size--;
            return ans;
        }


        // size() function
        public int size(){
            if (isEmpty()) {
                return 0;
            }
            return size;
        }


        // top function
        public int top() {
            if (isEmpty()) {
                return -1;
            }

            return head.data;
        }
        

    }
    
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(5);
        s.push(1);
        s.push(9);

        // System.out.println(s.pop());
        // // System.out.println(s.pop());
        System.out.println(s.size());

        
        System.out.println(s.top());

    }
}

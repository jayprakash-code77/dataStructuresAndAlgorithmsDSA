package dataStructuresAndAlgorithmsDSA.Queues;

/**
 * ImplementationOfQueue
 */

/*
 * Note :- Deque(Double ended Queue) and Dequeue(Remove) they both are different
 * Unque means >>> Add
 * Dequeue means >>> Remove
 * Front means >>> peek
 */

public class ImplementationOfQueue_WithArray {
    // Making Queue class
    static class Queue {
        private int array[];
        private int size;
        private int rear = -1;

        // constructor of Queue
        Queue(int size) {
            array = new int[size];
            this.size = size;
        }

        // isEmpty() function
        public boolean isEmpty() {
            return rear == -1;
        }

        // add() function >>> Enqueue
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full.");
                return;
            }
            rear++;
            array[rear] = data;
        }

        // remove() function >>> Dequeue (Time Complexity = O(n))
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }

            int ans = array[0];

            for (int i = 0; i < rear; i++) {
                array[i] = array[i + 1];
            }
            rear--;
            return ans;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }

            return array[0];
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(7);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
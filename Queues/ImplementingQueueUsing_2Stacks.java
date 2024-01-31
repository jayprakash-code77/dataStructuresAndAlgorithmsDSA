package dataStructuresAndAlgorithmsDSA.Queues;

import java.util.Stack;

public class ImplementingQueueUsing_2Stacks {
    /**
     * Queue
     */
    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // isEmpty() function
        public boolean isEmpty() {
            return s1.isEmpty();
        }

        // add() function
        public void add(int data) {
            // tranferring all data from s1 to s2
            while (!s1.empty()) {
                s2.push(s1.pop());
            }

            // pushing new data in s1
            s1.push(data);

            // again pushing all data from s2 to s1
            while (!s2.empty()) {
                s1.push(s2.pop());
            }
        }

        // remove() function
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }
            return s1.pop();
        }

        // peek() function
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }

            return s1.peek();
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(5);

        System.out.println(q.isEmpty());
        System.out.println(q.peek());
        System.out.println(q.remove());
    }
}

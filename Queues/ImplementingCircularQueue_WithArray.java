package dataStructuresAndAlgorithmsDSA.Queues;

class Queue {
    private int array[];
    private int size;
    private int rear = -1;
    private int front = -1;

    Queue(int size) {
        array = new int[size];
        this.size = size;
    }

    // isEmpty() function
    public boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    // isFull() function
    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    // add() fiunction
    public void add(int data) { // time complexity >>> O(1);
        if (isFull()) {
            System.out.println("Queue is full.");
            return;
        }

        // when first element is added.
        if (front == -1) {
            front = 0;
        }

        // updating "rear"
        rear = (rear + 1) % size;

        // storing data
        array[rear] = data;

    }

    // remove() function
    public int remove() {

        // if Queue is empty
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }

        //
        int result = array[front];

        // Condition, when only one element is present in Queue
        if (rear == front) {
            rear = front = -1;
        } else {
            front = (front + 1) % size;
        }
        return result;
    }

    // peek function
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }

        return array[front];
    }

    public void printArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}

public class ImplementingCircularQueue_WithArray {
    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q.remove());
        System.out.println(q.remove());

        // before adding 5
        System.out.println("Before adding 5 >>>  ");
        q.printArray();
        System.out.println("After adding 5 >>>  ");
        q.add(5);
        q.printArray();

    }
}

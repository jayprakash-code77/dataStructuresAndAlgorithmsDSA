package dataStructuresAndAlgorithmsDSA.StacksImplement;

class Stack {
     private int data[];
     private int topIndex = -1;

    Stack() {
        data = new int[10];
        // topIndex = -1;
    }

    // size() function
    public int size() {
        return topIndex + 1;
    }

    // isEmpty function
    public boolean isEmpty() {
        return topIndex == -1;
    }

    // push function
    public void push(int elem) {
        // corner case
        // if (topIndex == -1) {
        //     topIndex = 0;
        // }

        data[topIndex +1] = elem;
        topIndex++;
    }

    // top function
    public int top() {
        if (topIndex == -1) {
            return -1;
        }
        return data[topIndex];
    }

    // pop function
    public int pop() {
        // corner case
        if (topIndex == -1) {
            return -1;
        }
        final int ans = data[topIndex];
        data[topIndex] = 0;
        topIndex--;
        return ans;
    }

}



public class ImplementingStackWithArray {
    public static void main(String[] args) {
        Stac stack = new Stac();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        


        // System.out.println(stack.data[0]);  // >>> this is wrong 
        // System.out.println(stack.topIndex);  // >>> this is wrong 

        // System.out.println(stack.top());
        


    }
}

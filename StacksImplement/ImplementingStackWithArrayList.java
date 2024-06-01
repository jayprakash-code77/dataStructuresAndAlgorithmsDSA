package dataStructuresAndAlgorithmsDSA.StacksImplement;

import java.util.ArrayList;

class Stac {
    private ArrayList<Integer> list = new ArrayList<>();

    // Public method to push() an element onto the stack
    public void push(int element) {
        list.add(element);
    }

    // Public method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int ans = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return ans;
    }

    // Public method to check if the stack is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

}

public class ImplementingStackWithArrayList {

    public static void main(String[] args) {
        // Access the stack using public methods
        Stac stack = new Stac();
        stack.push(3);
        stack.push(7);

        // stack.list.add(3); //Now This is not allowed
        // >>>>>>>>>>>>>>>>**************************** IMPORTANT

        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}

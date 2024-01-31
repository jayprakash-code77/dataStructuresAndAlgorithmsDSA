package dataStructuresAndAlgorithmsDSA.StacksImplement.PracticeProblems;

import java.util.Stack;

public class ReverseStack_Recursively {

    public static void insertAtBottom_Recursively(Stack<Integer> St, int X) {
        // base case
        if (St.isEmpty()) {
            St.push(X);
            return;
        }

        int top = St.pop();
        insertAtBottom_Recursively(St, X);
        St.push(top);

        return;

    }

    // Reverse stack
    public static void ReverseStack(Stack<Integer> St) {
        // base case
        if (St.isEmpty()) {
            return;
        }
        int top = St.pop();
        ReverseStack(St);
        insertAtBottom_Recursively(St, top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        ReverseStack(s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

}

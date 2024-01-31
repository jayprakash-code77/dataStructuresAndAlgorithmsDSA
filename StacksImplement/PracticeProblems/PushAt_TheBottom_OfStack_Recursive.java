package dataStructuresAndAlgorithmsDSA.StacksImplement.PracticeProblems;

import java.util.*;

public class PushAt_TheBottom_OfStack_Recursive {
    public static Stack<Integer> insertAtBottom_Recursively(Stack<Integer> St, int X) {
        // base case
        if (St.isEmpty()) {
            St.push(X);
            return St;
        }

        int top = St.pop();
        insertAtBottom_Recursively(St, X);
        St.push(top);

        return St;

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        s = insertAtBottom_Recursively(s, 9);
        System.out.println(s.get(3));

    }
}

package dataStructuresAndAlgorithmsDSA.StacksImplement.PracticeProblems;

import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> St, int X) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = St.size() - 1; i>=0; i--) {
            list.add(St.pop());
        }

        St.push(X);

        for(int i = list.size() -1; i >=0 ; i--) {
            St.push(list.get(i));
        }

        return St;
    }
}


public class PushAt_TheBottom_OfStack_Iterative {
    public static void main(String[] args) {
        Solution s = new Solution();
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);


        stack = s.insertAtBottom(stack, 7);  // this will make the 
        System.out.println(stack.get(1));
    }
}

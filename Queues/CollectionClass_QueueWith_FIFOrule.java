package dataStructuresAndAlgorithmsDSA.Queues;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class CollectionClass_QueueWith_FIFOrule {
    public static void main(String[] args) {
        // first way
        Queue <Integer> q = new LinkedList<>();
        q.add(3);
        q.add(4);
        q.add(7);
        System.out.println(q.remove());
        
        // seconf way
        Queue <Integer> dq = new ArrayDeque<>();
        dq.add(3);
        dq.add(4);
        dq.add(7);
        System.out.println(dq.remove());


    }
}

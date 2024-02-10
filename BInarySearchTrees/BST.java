package dataStructuresAndAlgorithmsDSA.BInarySearchTrees;

/**
 * BST
 * What is binary search tree.
 * 1) Left Subtree Nodes are always less than root.
 * 2) Right Subtree Nodes are always greater than root.
 * 3) Left ans Right Subtrees are also BST with no Duplicates.
 * 4) Left ans Right Subtrees are also BST with Duplicates.
 * 5) in-order Traversal of BST gives a increasing shorted sequence
 */

/*
 * BST search:-
 * 1) Time complexity :-O(height of tree"H")
 * 2) Skewed Trees
 */

public class BST {

    static class Node {
        private int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int nodesValue) {

        // base case
        if (root == null) {
            root = new Node(nodesValue);
            return root;
        }

        if (root.data > nodesValue) {
            // left subTree
            root.left = insert(root.left, nodesValue);
        } else {
            // right subTree
            root.right = insert(root.right, nodesValue);
        }

        return root;
    }

    public static void inOrder(Node root) {
        // base case
        if (root == null) {
            // System.out.print("Empty tree.");
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        int nodes[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < nodes.length; i++) {
            root = insert(root, nodes[i]);
        }

        inOrder(root);
    }

    
 
}
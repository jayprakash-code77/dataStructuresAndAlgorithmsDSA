package dataStructuresAndAlgorithmsDSA.BInarySearchTrees;

import java.util.ArrayList;

/**
 * BST
 * What is binary search tree.
 * 1) Left Subtree Nodes are always less than root.
 * 2) Right Subtree Nodes are always greater than root.
 * 3) Left ans Right Subtrees are also BST with no Duplicates.
 * 4) Left ans Right Subtrees are also BST with Duplicates.
 * 5) in-order Traversal of BST gives a increasing shorted sequence of number in
 * case of the data is integer
 */

/*
 * BST search:-
 * 1) Time complexity :- O(height of tree"H")
 * 2) Skewed Trees :-
 */

public class BST {
    // Node class
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

    // fucntion to insert data
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

    // function to build BST
    public static Node builtBST(int nodeArray[]) {
        Node root = null;
        for (int i = 0; i < nodeArray.length; i++) {
            root = insert(root, nodeArray[i]);
        }
        return root;
    }

    public static void inOrderPrint(Node root) {
        // base case
        if (root == null) {
            // System.out.print("Empty tree.");

            return;
        }

        inOrderPrint(root.left);
        System.out.print(root.data + " ");
        inOrderPrint(root.right);
    }

    // Search a node in BST
    public static boolean search(Node root, int Key) {
        // base case
        if (root == null) {
            return false;
        }

        if (root.data > Key) {
            return search(root.left, Key);
        } else if (root.data == Key) {
            return true;
        } else {
            return search(root.right, Key);
        }
    }

    // Delete a node in BST
    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else { // root == val
                 // case 1 > Node having no child
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 > Node not having left child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 > Node having both child
            // <<<<<<<<<<<<<<<<< IMPORTANT >>>>>>>>>>>>>>>
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    // function to find "inorderSuccessor" (Left most node in the right sub-tree)
    public static Node inorderSuccessor(Node root) {
        while (root.left != null) { // here the root will never become null, so no need to handle the case of null
                                    // root.
            root = root.left;
        }
        return root;
    }

    // Print in Range function
    public static void printInRange(Node root, int start, int end) {
        // corner case
        if (root == null) {
            return;
        }
        // printing the values
        if (root.data >= start && root.data <= end) {
            printInRange(root.left, start, end);
            System.out.print(root.data + " ");
            printInRange(root.right, start, end);
        } else if (root.data >= start) {
            printInRange(root.left, start, end);
        } else {
            printInRange(root.right, start, end);
        }
    }


    // fucntion to calculate the number of paths "from root to leaf".
        public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
            // base case
            if (root == null) {
                return;
            }
            // adding the root node to ArrayList
            path.add(root.data);

            // for leaf node 
            if (root.left == null && root.right == null) {
                printPath(path);
            }
            else { // forn non-leaf node
                printRoot2Leaf(root.left, path);
                printRoot2Leaf(root.right, path);
            }
            // remove the node data 
            path.remove(path.size()-1);
        }

        private static void printPath(ArrayList<Integer> path) {
            for (int i = 0; i < path.size(); i++) {
                System.out.print(path.get(i)+" ");
            }
            System.out.println();
        }


    public static void main(String[] args) {
        int nodes[] = { 5, 1, 3, 4, 2, 7 };
        Node root = builtBST(nodes);
        // fucntion to print BST
        inOrderPrint(root); // 1 2 3 4 5 7 = output

        System.out.println();

        // function to search node
        System.out.println(search(root, 1)); // true = output

        // System.out.println();

        // fucntion to delete node from BST
        /* 
        delete(root, 3);
        inOrderPrint(root);
        */

        // Print in Range function
        // printInRange(root, 3, 5);

        printRoot2Leaf(root, new ArrayList<>());



    }
}
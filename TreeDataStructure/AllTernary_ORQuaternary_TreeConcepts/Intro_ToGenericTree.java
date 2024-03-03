package dataStructuresAndAlgorithmsDSA.TreeDataStructure.AllTernary_ORQuaternary_TreeConcepts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import javax.swing.tree.TreeNode;

// Generic Tree can have many Nodes and childs.
public class Intro_ToGenericTree {

    static class JTreeNode<T> {
        T data;
        ArrayList<JTreeNode<T>> children;

        public JTreeNode(T data) {
            this.data = data;
            this.children = new ArrayList<>();
        }
    }

    public static void printGT_preOrder(JTreeNode<Integer> root) {
        // special case
        if (root == null) {
            return;
        }
        // print yourself
        System.out.print(root.data + " ");
        // call children

        for (int i = 0; i < root.children.size(); i++) {
            JTreeNode<Integer> child = root.children.get(i);
            printGT_preOrder(child);
        }
    }

    // public static void printGT_withChilds(JTreeNode<Integer> root) {
    // // special case
    // if (root == null) {
    // return;
    // }

    // // operations
    // System.out.print(root.data + ": ");
    // // print childs
    // for (int i = 0; i < root.children.size(); i++) {
    // System.out.print(root.children.get(i).data + " ");
    // }

    // System.out.println();
    // // recursive calls on children's
    // for (int i = 0; i < root.children.size(); i++) {
    // JTreeNode<Integer> child = root.children.get(i);
    // printGT_withChilds(child);
    // }

    // }

    public static int numberOfNodes(JTreeNode<Integer> root) {
        // special case
        if (root == null) {
            return 0;
        }
        // count variable
        int count = 1;
        for (int i = 0; i < root.children.size(); i++) {
            int childCount = numberOfNodes(root.children.get(i));
            count += childCount;
        }
        return count;
    }

    // fucntion to calculate the sum of nodes data.
    public static int sumOfNOdes(JTreeNode<Integer> root) {
        // special case
        if (root == null) {
            return 0;
        }
        int sum = root.data;
        // call children
        for (int i = 0; i < root.children.size(); i++) {
            int childSum = sumOfNOdes(root.children.get(i));
            sum += childSum;
        }
        return sum;
    }

    // function to take generic tree input
    public static JTreeNode<Integer> inputTree() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the root of the tree: ");
        int rootData = s.nextInt();
        if (rootData == -1) {
            return null;
        }
        JTreeNode<Integer> root = new JTreeNode<Integer>(rootData);
        Queue<JTreeNode<Integer>> pendNodes = new LinkedList<>();
        pendNodes.add(root);

        while (!pendNodes.isEmpty()) {
            JTreeNode<Integer> front = pendNodes.remove();
            System.out.println("Enter the number of children of: " + front.data);
            int numChilds = s.nextInt();
            for (int i = 0; i < numChilds; i++) {
                System.out.println("Enter the " + i + "th child of " + front.data);
                int childData = s.nextInt();
                JTreeNode<Integer> childNode = new JTreeNode<Integer>(childData);
                front.children.add(childNode);
                pendNodes.add(childNode);
            }
        }
        return root;
    }

    // function to print the nodes level wise (INCOMPLETE)
    public static void printLevelWise(JTreeNode<Integer> root) {

    }

    // function to print the nodes data which are greater than "x".
    public static int greaterThanX(JTreeNode<Integer> root, int x) {
        if (root == null) {
            return 0;
        }
        // initialize count here
        int count = 0;
        if (root.data > x) {
            count++;
        }
        for (int i = 0; i < root.children.size(); i++) {
            JTreeNode<Integer> child = root.children.get(i);
            count += greaterThanX(child, x);
        }
        return count;
    }

    // function to find the "Height of Generic Tree".
    public static int getHeight(JTreeNode<Integer> root) {
        if (root == null) {
            return 0; // Height of an empty tree is 0
        } else {
            int maxHeight = 0;
            for (JTreeNode<Integer> child : root.children) {
                int childHeight = getHeight(child);
                if (childHeight > maxHeight) {
                    maxHeight = childHeight;
                }
            }
            return maxHeight + 1; // Adding 1 to account for the current level
        }
    }

    // function to print the "Generic Tree in post-Order".
    public static void printPostOrder(JTreeNode<Integer> root) {
        if (root == null)
            return;

        // Visit each child of the root node
        for (JTreeNode<Integer> child : root.children) {
            printPostOrder(child);
        }

        // After visiting all children, print the data of the root node
        System.out.print(root.data + " ");
    }

    // function to check if the value "x" is present in the tree OR not.
    public static boolean checkIfContainsX(JTreeNode<Integer> root, int x) {

        // Write your code here
        if (root == null) {
            return false;
        }

        if (root.data == x) {
            return true;
        }

        for (JTreeNode<Integer> child : root.children) {
            if (checkIfContainsX(child, x)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        JTreeNode<Integer> root = new JTreeNode<>(4);
        JTreeNode<Integer> node1 = new JTreeNode<>(2);
        JTreeNode<Integer> node2 = new JTreeNode<>(3);
        JTreeNode<Integer> node3 = new JTreeNode<>(1);
        JTreeNode<Integer> node4 = new JTreeNode<>(5);
        JTreeNode<Integer> node5 = new JTreeNode<>(6);
        // children of root node
        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        // children of root's child "node2"
        node2.children.add(node4);
        node2.children.add(node5);

        // print JTree in preOrder
        // printGT_preOrder(root);
        // System.out.println(numberOfNodes(root));
        // System.out.println(sumOfNOdes(root));

        // function to take input of the Generic tree
        /*
         * JTreeNode<Integer> ans = inputTree();
         * printGT_preOrder(ans);
         */

        /*
         * printGT_preOrder(root);
         * System.out.println();
         * System.out.println(greaterThanX(root, 1));
         */

        /*
         * printGT_preOrder(root);
         * System.out.println();
         * System.out.println(getHeight(root));
         */

        /*
         * printGT_preOrder(root);
         * System.out.println();
         * printPostOrder(root);
         */

        /*
         * printGT_preOrder(root);
         * System.out.println();
         * System.out.println(checkIfContainsX(root, 5));
         */

    }
}

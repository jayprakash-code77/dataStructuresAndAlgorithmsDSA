package dataStructuresAndAlgorithmsDSA.TreeDataStructure.AllBinary_TreeConcepts;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Root Node :- the first stating point of Tree
 * Branch :- the Node that is the child of another Node
 * Leaf :- the NOde that does not have any child (last Node)
 * Note:- there can be many branches for general Tree.
 * 
 * 
 */

/*
 * Binary Tree :- It will have only two branch
 * Left child and Right child
 * Node having same parent are also called as "Sibling Nodes"
 * Leaf :- the NOde that does not have any child (last Node)
 * Ancestors :- the parents of parent Node 
 * Levels :- l1, l2, l3, etc.
 * Depth :- l1 have depth 1, l2 have depth 2 and so on... 
 * sub-Tree :- the left and right childs of the Nodes are sub trees of that Node. >>> "Left sub=Tree" and "Right sub-Tree"

 */
public class BinaryTree {

    // Node class for every Node
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Binary Tree class >>>>>>>>>>>>>>>>>>>>>>>
    static class BT {
        // index variable ot taravel on every index
        static int idx = -1;

        // build tree function
        public static Node buildTree(int nodes[]) {
            // increament the idx
            idx++;
            //
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            //
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

        }

        // >>>>>>>>>>>>>>>>>> TRANSVERSAL ON BINARY TREE <<<<<<<<<<<<<<<<<<<<<<<<<<<

        /*
         * Rules of travelling in "Pre-Order-Trasversal" >>>
         * 1) travel on 'root' first.
         * 2) travel on the 'left Sub-tree' second.
         * 3) travel on the 'right sub-tree' third.
         */
        // pre-order transversal>>>>>>>>>>>>>
        public void preOrderTransversal(Node root) {
            if (root == null) {
                System.out.print(-1 + " ");
                return;
            }
            System.out.print(root.data + " ");
            preOrderTransversal(root.left);
            preOrderTransversal(root.right);
        }

        /*
         * Rules of travelling in "in-Order-Trasversal" >>>
         * 1) travel on 'left Sub-tree' first.
         * 2) travel on the 'root' second.
         * 3) travel on the 'right sub-tree' third.
         */
        // in-order transversal>>>>>>>>>>>>>>>>>>>
        public void inOrder_Transversal(Node root) {
            if (root == null) {
                return;
            }

            inOrder_Transversal(root.left);
            System.out.print(root.data + " ");
            inOrder_Transversal(root.right);
        }

        /*
         * Rules of travelling in "post-Order-Trasversal" >>>
         * 1) travel on 'left Sub-tree' first.
         * 2) travel on the 'right sub-tree' second.
         * 3) travel on the 'root' third.
         */
        // post-order transversal >>>>>>>>>>>>>>>>>>>>>>>>>>>>
        public void postOrder(Node root) {
            // base case
            if (root == null) {
                return;
            }

            // travel on 'left Sub-tree'
            postOrder(root.left);
            // travel on 'right sub-tree'
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        /*
         * BFS :- Breadth first search
         * DFS :- Depth first search
         */
        // level-order transversal >>>>>>>>>>>>>>>>
        public void levelOrderTransversal(Node root) {
            // corner case
            if (root == null) {
                return;
            }
            // Queue
            Queue<Node> q = new LinkedList<>();

            // add the root of the tree first
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();

                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    // storing the left child tree
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    // storing the right child tree
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }

                }

            }
        }

    }

    public static void main(String[] args) {

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BT tree = new BT();

        // pre-Order transversal
        /*
         * Node root = tree.buildTree(nodes);92cczsz
         * tree.preOrderTransversal(root);
         */

        // in-Order transversal
        /*
         * Node root = tree.buildTree(nodes);
         * tree.inOrder_Transversal(root);
         */

        // post-Order transversal
        /*
         * Node root = tree.buildTree(nodes);
         * tree.postOrder(root);
         */

        // Level-Order transversal
        Node root = tree.buildTree(nodes);
        tree.levelOrderTransversal(root);

    }
}

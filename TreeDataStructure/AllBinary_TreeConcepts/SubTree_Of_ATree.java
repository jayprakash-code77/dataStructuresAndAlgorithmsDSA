package dataStructuresAndAlgorithmsDSA.TreeDataStructure.AllBinary_TreeConcepts;

public class SubTree_Of_ATree {
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

    static class BinaryTree {
        static int idx;

        // function to build a tree
        BinaryTree() {
            this.idx = -1;
        }

        public Node Build(int nodes[]) {
            idx++;

            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);

            newNode.left = Build(nodes);
            newNode.right = Build(nodes);

            return newNode;

        }

        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Travelling
        // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        public void PreOrder(Node root) {
            if (root == null) {
                return;
            }

            System.out.print(root.data + " ");
            PreOrder(root.left);
            PreOrder(root.right);

        }

        public boolean isIdentical(Node root, Node subRoot) {
            //
            if (root == null && subRoot == null) {
                return true;
            }

            //
            if (root == null || subRoot == null) {
                return false;
            }

            if (root.data == subRoot.data) {
                return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
            }

            return false;

        }

        public boolean isSubTree(Node root, Node subRoot) {
            if (root == null) {
                return true;
            }

            if (subRoot == null) {
                return false;
            }

            if (root.data == subRoot.data) {
                if (isIdentical(root, subRoot)) {
                    return true;
                }
            }

            return isSubTree(root.left, subRoot) || isSubTree(root.left, subRoot);

        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        int nodesOfSubTree[] = { 2, 4, -1, -1, 5, -1, -1 };

        // making big tree;
        BinaryTree b = new BinaryTree();
        Node bigTree = b.Build(nodes);
        b.PreOrder(bigTree);

        // taking new lines
        System.out.println();

        // making sub tree;
        BinaryTree c = new BinaryTree();
        Node subTree = c.Build(nodesOfSubTree);
        b.PreOrder(subTree);

        // taking new lines
        System.out.println();

        boolean result = b.isSubTree(bigTree, subTree);
        System.out.println(result);

    }
}

package dataStructuresAndAlgorithmsDSA.TreeDataStructure.AllBinary_TreeConcepts;

public class QCount_NumOfNodes {

    // Node class
    static class Node {
        private int data;
        Node left;
        Node right;

        Node(int Data) {
            this.data = Data;
            this.left = null;
            this.right = null;
        }
    }

    static class Questions_BT {
        static int idx = -1;

        // function to build "Binary Tree"
        public Node buildBT(int nodes[]) {
            // increment of "idx"
            idx++;
            // base case
            if (nodes[idx] == -1) {
                return null;
            }
            // creating new Node
            Node newNode = new Node(nodes[idx]);

            newNode.left = buildBT(nodes);
            newNode.right = buildBT(nodes);

            return newNode;
        }

        // function to Count number of Nodes in a Binary Tree
        public int countNodes(Node root) {
            // base case
            if (root == null) {
                return 0;
            }
            // operations
            int leftNodes = countNodes(root.left);
            int rightNode = countNodes(root.right);

            return leftNodes + rightNode + 1;
        }

        // function to sum all the Nodes in the
        public int countNodesSum(Node root) {
            if (root == null) {
                return 0;
            }
            int leftSum = countNodesSum(root.left);
            int rightSum = countNodesSum(root.right);

            return leftSum + rightSum + root.data;
        }


        // function to calculate "Height of Tree"
        public int countHeight(Node root) {
            if (root == null) {
                return 0;
            }

            int l = countHeight(root.left);
            int r = countHeight(root.right);

            return Math.max(l+1, r+1);
        } 




        // Function to calculate diameter of tree
        // First Approach of O(n^2)   >>>>>>>>>>>>>>>>>>>>>
        public int countDiameter(Node root) {
            // base case
            if (root == null) {
                return 0;
            }
            // operations
            int leftDia = countDiameter(root.left);
            int rightDia = countDiameter(root.right);
            int RootThroughDia = countHeight(root.left) + countHeight(root.right) + 1;
            // return statement
            return Math.max(leftDia, Math.max(rightDia, RootThroughDia));
        }



        // Function to calculate diameter of tree
        //Second Approach of O(n)   >>>>>>>>>>>>>>>>>>>>>

        // helper class
        static class TreeInfo {
            int ht;
            int diam;

            TreeInfo(int ht, int diam) {
                this.ht = ht;
                this.diam = diam;
            }
        }
        public TreeInfo countDiameterOn(Node root) {
            if (root == null) {
                return new TreeInfo(0, 0);
            }

            TreeInfo leftInfo = countDiameterOn(root.left);
            TreeInfo rightInfo = countDiameterOn(root.right);

            int myHeight = Math.max(leftInfo.ht, rightInfo.ht) + 1;

            int diaLeft = leftInfo.diam;
            int diaRight = rightInfo.diam;
            int diaRootThrough = leftInfo.ht + rightInfo.ht + 1;

            int myDiam = Math.max(Math.max(diaRight, diaLeft), diaRootThrough);

            TreeInfo myInfo = new TreeInfo(myHeight, myDiam);

            return myInfo;
        }













        // function to convert 
                        
        public void mirrorBinaryTree(Node root) {
            // base case
            if (root == null) {
                return;
            }
        }







    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Questions_BT b = new Questions_BT();
        // build Binary Tree
        Node root = b.buildBT(nodes);

        // Count number of Nodes in a Binary Tree >>>>>>>>>>>
        /*
        int numNodes = b.countNodes(root);
        System.out.println(numNodes);
         */

        //  sum of all the data (integer) Nodes in the tree
        /* 
        int result = b.countNodesSum(root);
        System.out.println(result);
        */


        // count the "Height f Tree" 
        /* 
        int result = b.countHeight(root);
        System.out.println(result);
        */

        // Function to calculate diameter of tree
        //First Approach of O(n^2)   >>>>>>>>>>>>>>>>>>>>>
        /* 
        int ans = b.countDiameter(root);
        System.out.println(ans);
        */

        // function to calculate diameter of tree
        //First Approach of O(n)   >>>>>>>>>>>>>>>>>>>>>
        System.out.println(b.countDiameterOn(root).ht);
        System.out.println(b.countDiameterOn(root).diam);



    }
}

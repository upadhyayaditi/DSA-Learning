package Trees;

public class SumOfNodes {
    static class Node {
        int data;
        Node left;
        Node right;

        // Constructor to initialize a node with given data
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // BinaryTree class to build a binary tree using recursion
    static class BinaryTree {
        static int idx = -1; // Static variable to keep track of the index while traversing the array

        // Method to build a binary tree using recursion
        public static Node buildTree(int nodes[]) {
            idx++; // Move to the next index in the array
            if (nodes[idx] == -1) { // If current node value is -1, return null (indicating an empty node)
                return null;
            }
            Node newNode = new Node(nodes[idx]); // Create a new node with the value at the current index
            newNode.left = buildTree(nodes); // Recursively build the left subtree
            newNode.right = buildTree(nodes); // Recursively build the right subtree
            return newNode; // Return the constructed node
        }

        // Method to calculate the sum of all nodes in the binary tree
        public static int sumOfNodes(Node root){
            if (root == null) { // Base case: if the root is null, return 0
                return 0;
            }
            int leftSum = sumOfNodes(root.left); // Recursively calculate the sum of nodes in the left subtree
            int rightSum = sumOfNodes(root.right); // Recursively calculate the sum of nodes in the right subtree

            return leftSum + rightSum + root.data; // Total sum = sum of nodes in left subtree + sum of nodes in right subtree + data of current node
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; // Array representing the binary tree
        BinaryTree tree = new BinaryTree(); // Create an instance of BinaryTree class

        Node root = tree.buildTree(nodes); // Build the binary tree using the array

        System.out.println(tree.sumOfNodes(root)); // Print the sum of all nodes in the binary tree
    }
}

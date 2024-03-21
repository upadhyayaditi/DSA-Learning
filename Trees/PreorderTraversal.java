package Trees;

public class PreorderTraversal {
    // Node class representing individual nodes in the binary tree
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

    // BinaryTree class to build a binary tree using recursion and perform preorder traversal
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

        // Method to perform preorder traversal of the binary tree
        public void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " "); // Print the data of the current node
            preorder(root.left); // Recursively traverse the left subtree
            preorder(root.right); // Recursively traverse the right subtree
        }
    }

    public static void main(String args[]) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; // Array representing the binary tree
        BinaryTree tree = new BinaryTree(); // Create an instance of BinaryTree class

        Node root = tree.buildTree(nodes); // Build the binary tree using the array
        tree.preorder(root); // Perform preorder traversal starting from the root node
    }
}

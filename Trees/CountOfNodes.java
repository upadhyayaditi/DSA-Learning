package Trees;

public class CountOfNodes {
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

        // Method to count the total number of nodes in the binary tree
        public static int countOfNodes(Node root){
            if(root == null){ // Base case: if the root is null, return 0
                return 0;
            }
            int leftNodes = countOfNodes(root.left); // Recursively count nodes in the left subtree
            int rightNodes = countOfNodes(root.right); // Recursively count nodes in the right subtree

            return leftNodes + rightNodes + 1; // Total nodes = nodes in left subtree + nodes in right subtree + 1 (for the current node)
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; // Array representing the binary tree
        BinaryTree tree = new BinaryTree(); // Create an instance of BinaryTree class

        Node root = tree.buildTree(nodes); // Build the binary tree using the array

        System.out.print(tree.countOfNodes(root)); // Print the total number of nodes in the binary tree
    }
}

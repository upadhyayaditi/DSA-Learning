package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
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

        // Method to perform level order traversal
        public void levelOrder(Node root){
            if (root == null) { // Base case: if the root is null, return
                return;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.add(root); // Add the root node to the queue
            queue.add(null); // Add a null marker to indicate the end of the current level

            while (!queue.isEmpty()) {
                Node currNode = queue.remove(); // Remove the front node from the queue
                if (currNode == null) { // If the current node is null, indicating the end of the level
                    System.out.println(); // Move to the next line
                    if (queue.isEmpty()) { // If the queue is empty, traversal is complete
                        break;
                    } else {
                        queue.add(null); // Add another null marker to indicate the end of the next level
                    }
                } else {
                    System.out.print(currNode.data + " "); // Print the data of the current node
                    if (currNode.left != null) { // If the left child exists, add it to the queue
                        queue.add(currNode.left);
                    }
                    if (currNode.right != null) { // If the right child exists, add it to the queue
                        queue.add(currNode.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; // Array representing the binary tree
        BinaryTree tree = new BinaryTree(); // Create an instance of BinaryTree class

        Node root = tree.buildTree(nodes); // Build the binary tree using the array

        tree.levelOrder(root); // Perform level order traversal starting from the root node
    }
}

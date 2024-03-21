package Trees;

public class BuildingBinarySearchTree {
    
    // TreeNode class representing individual nodes in the binary search tree
    public static class TreeNode {
        int data;  // Data stored in the node
        TreeNode leftChild;  // Reference to the left child node
        TreeNode rightChild;  // Reference to the right child node

        // Constructor to initialize a node with given data
        public TreeNode(int data) {
            this.data = data;
        }
    }

    // BinarySearch class representing the Binary Search Tree
    public static class BinarySearch {
        TreeNode root;  // Reference to the root of the binary search tree

        // Constructor to initialize an empty binary search tree
        public BinarySearch() {
            this.root = null;
        }

        // Method to insert a value into the binary search tree
        public void insert(int value) {
            TreeNode node = new TreeNode(value);  // Create a new node with the given value

            // If the tree is empty, set the new node as the root
            if (root == null) {
                root = node;
                return;
            }

            TreeNode current = root;

            // Traverse the tree to find the appropriate position to insert the new node
            while (true) {
                if (value <= current.data) {  // If the value is less than or equal to current node's data
                    if (current.leftChild == null) {  // If left child is null, insert the new node here
                        current.leftChild = new TreeNode(value);
                        break;
                    }
                    current = current.leftChild;  // Move to the left child
                } else {  // If the value is greater than current node's data
                    if (current.rightChild == null) {  // If right child is null, insert the new node here
                        current.rightChild = new TreeNode(value);
                        break;
                    }
                    current = current.rightChild;  // Move to the right child
                }
            }
        }
    }

    // Main method to demonstrate the usage of Binary Search Tree
    public static void main(String[] args) {
        BinarySearch tree = new BinarySearch();  // Create a new instance of BinarySearch tree
        tree.insert(7);  // Insert values into the tree
        tree.insert(9);
        tree.insert(1);
        tree.insert(9);
    }
}

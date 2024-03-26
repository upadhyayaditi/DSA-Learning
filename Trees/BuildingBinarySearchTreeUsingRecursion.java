package Trees;

public class BuildingBinarySearchTreeUsingRecursion {
    
    // TreeNode class representing each node in the binary search tree
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        // Constructor to initialize a node with data
        TreeNode(int data){
            this.data = data;
        }
    }

    // Function to insert a value into the binary search tree recursively
    public static TreeNode insert(TreeNode root, int value){
        // If the root is null, create a new node with the given value
        if(root == null){
            root = new TreeNode(value);
            return root;
        }
        // If the value is less than the current node's data, insert into the left subtree
        if (root.data > value) {
           root.left = insert(root.left, value);
        }
        // If the value is greater than or equal to the current node's data, insert into the right subtree
        else{
            root.right = insert(root.right, value);
        }
        return root;
    }

    // Function to perform inorder traversal of the binary search tree
    public static void inorder(TreeNode root){
        // Base case: if the root is null, return
        if (root == null) {
            return;
        }
        // Recursively traverse the left subtree
        inorder(root.left);
        // Print the data of the current node
        System.out.print(root.data + " ");
        // Recursively traverse the right subtree
        inorder(root.right);
    }

    public static void main(String[] args) {
        // Array of numbers to be inserted into the binary search tree
        int[] nums = {3, 6, 1, 8, 9, 4, 2, 17};
        TreeNode root = null;
        
        // Insert each number from the array into the binary search tree
        for (int i = 0; i < nums.length; i++) {
            root = insert(root, nums[i]);
        }

        // Perform inorder traversal of the constructed binary search tree
        inorder(root);

        // Print a new line after inorder traversal is complete
        System.out.println();
    }
}

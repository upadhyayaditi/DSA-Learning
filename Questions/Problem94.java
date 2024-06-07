// https://leetcode.com/problems/binary-tree-inorder-traversal/

class Solution {
    // List to store the result of the inorder traversal
    List<Integer> result = new ArrayList<>();

    // Method to initiate the inorder traversal
    public List<Integer> inorderTraversal(TreeNode root) {
        // Call the helper method to perform the traversal
        inorder(root);
        // Return the result list
        return result;
    }

    // Helper method to perform the inorder traversal
    public void inorder(TreeNode root) {
        // If the current node is null, return (base case)
        if (root == null) {
            return;
        }
        // Recursively traverse the left subtree
        inorder(root.left);
        // Add the value of the current node to the result list
        result.add(root.val);
        // Recursively traverse the right subtree
        inorder(root.right);
    }
}

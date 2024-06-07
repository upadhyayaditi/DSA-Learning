// https://leetcode.com/problems/binary-tree-preorder-traversal/description/

class Solution {
    // List to store the result of the preorder traversal
    List<Integer> result = new ArrayList<>();

    // Method to initiate the preorder traversal
    public List<Integer> preorderTraversal(TreeNode root) {
        // Call the helper method to perform the traversal
        preorder(root);
        // Return the result list
        return result;
    }

    // Helper method to perform the preorder traversal
    public void preorder(TreeNode root) {
        // If the current node is null, return (base case)
        if (root == null) {
            return;
        }
        // Add the value of the current node to the result list
        result.add(root.val);
        // Recursively traverse the left subtree
        preorder(root.left);
        // Recursively traverse the right subtree
        preorder(root.right);
    }
}

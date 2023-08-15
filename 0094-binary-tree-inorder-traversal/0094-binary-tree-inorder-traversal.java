/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> inorder_elements = new ArrayList<Integer>();
        inorderTraversalHelper(root, inorder_elements);
        return inorder_elements;
    }
    public void inorderTraversalHelper(TreeNode root, List<Integer> elements){
        if(root != null){
            inorderTraversalHelper(root.left, elements);
            elements.add(root.val);
            inorderTraversalHelper(root.right, elements);
        }
    }
}
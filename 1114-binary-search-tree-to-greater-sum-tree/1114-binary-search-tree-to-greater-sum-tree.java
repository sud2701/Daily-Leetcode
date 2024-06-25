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
    int total_sum;
    public TreeNode bstToGst(TreeNode root) {
        total_sum = 0;
        inOrder(root);
        inOrderChange(root);
        return root;
    }

    public void inOrder(TreeNode root) {
        if(root != null) {
            inOrder(root.left);
            total_sum += root.val;
            inOrder(root.right);
        }
    }

    public void inOrderChange(TreeNode root) {
        if(root != null){
            inOrderChange(root.left);
            total_sum -= root.val;
            root.val += total_sum;
            inOrderChange(root.right);
        }
    }
}
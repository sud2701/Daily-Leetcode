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
    ArrayList<Integer> result = new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postOrderHelper(root);
        return result;
    }

    public void postOrderHelper(TreeNode root) {
        if(root == null){
            return;
        }
        postOrderHelper(root.left);
        postOrderHelper(root.right);
        result.add(root.val);
    }
}
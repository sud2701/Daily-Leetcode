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
    int count;
    public int averageOfSubtree(TreeNode root) {
        count = 0;
        sumAndCount(root);
        return count;
    }

    public int[] sumAndCount(TreeNode root) {
        int[] result = new int[2];
        if(root == null) {
            return result;
        }
        int sum = 0;
        int num_count = 0;
        int[] left_values = new int[2];
        int[] right_values = new int[2];
        if(root.left != null){
            left_values = sumAndCount(root.left);
        }
        if(root.right != null){
            right_values = sumAndCount(root.right);
        }
        num_count = left_values[1] + right_values[1] + 1;
        sum = left_values[0] + right_values[0] + root.val;
        if(sum / num_count == root.val) {
            count += 1;
        }
        result[0] = sum;
        result[1] = num_count;
        return result;
    }
}
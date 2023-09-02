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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int n = nums.length;
        return getmaxBinaryTree(nums, 0, n - 1);
    }

    public TreeNode getmaxBinaryTree(int[] nums, int start, int end){
        
        int max_pos = start;
        for(int i = start + 1; i <= end; i++){
            if(nums[i] > nums[max_pos]){
                max_pos = i;
            }
        }
        TreeNode root = new TreeNode(nums[max_pos]);
        TreeNode left;
        if(max_pos == start){
            left = null;
        }
        else {
            left = getmaxBinaryTree(nums, start, max_pos - 1);
        }
        TreeNode right;
        if(max_pos == end){
            right = null;
        }
        else {
            right = getmaxBinaryTree(nums, max_pos + 1, end);
        }
        root.left = left;
        root.right = right;
        return root;
    }
}
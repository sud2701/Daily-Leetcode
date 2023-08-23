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
    public int findTilt(TreeNode root) {
        if(root == null){
            return 0;
        }
        int count = 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(queue.size() != 0){
            TreeNode temp = queue.remove();
            temp.val = calculateTilt(temp);
            count += temp.val;
            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }
        }
        return count;
    }
    public int sumOfNodes(TreeNode root){
        if(root == null) {
            return 0;
        }
        return sumOfNodes(root.left) + root.val + sumOfNodes(root.right);
    }
    public int calculateTilt(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 0;
        }
        return Math.abs(sumOfNodes(root.left) - sumOfNodes(root.right));
    }
}
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
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int count = 1;
        while(queue.size() != 0){
            int temp = queue.size();
            for(int i = 0; i < temp; i++){
                TreeNode x = queue.remove();
                if(x.left == null && x.right == null){
                    return count;
                }
                else {
                if(x.left != null){
                    queue.add(x.left);
                }
                if(x.right != null){
                    queue.add(x.right);
                }
                }
            }
            count += 1;
        }
        return count;
    }
}
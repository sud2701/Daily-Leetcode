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
    public List<Double> averageOfLevels(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<Double> result = new ArrayList<Double>();
        queue.add(root);
        int n = 0;
        double sum = 0;
        TreeNode temp;
        double level_avg = 0;
        if(root == null){
            return result;
        }
        while(!queue.isEmpty()){
            n = queue.size();
            sum = 0;
            for(int i = 0; i < n; i++){
                temp = queue.remove();
                sum += temp.val;
                if(temp.left != null){
                    queue.add(temp.left);
                }
                if(temp.right != null){
                    queue.add(temp.right);
                }
            }
            level_avg = (double)sum / n;
            result.add(level_avg);
        }
        return result;
    }
}
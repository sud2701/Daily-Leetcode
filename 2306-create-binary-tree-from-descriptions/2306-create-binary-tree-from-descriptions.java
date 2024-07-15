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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer, TreeNode> map = new HashMap<Integer, TreeNode>();
        HashSet<TreeNode> set = new HashSet<TreeNode>();
        TreeNode root = null;
        TreeNode parent = null;
        TreeNode child = null;
        for(int[] i: descriptions) {
            if(map.get(i[0]) != null) {
                parent = map.get(i[0]);
            }
            else {
                parent = new TreeNode(i[0]);
                map.put(i[0], parent);
            }
            if(map.get(i[1]) != null) {
                child = map.get(i[1]);
            }
            else {
                child = new TreeNode(i[1]);
                map.put(i[1], child);
            }
            if(i[2] == 1){
                parent.left = child;
            }
            else {
                parent.right = child;
            }
            set.add(parent);
        }
        for(int[] i: descriptions) {
            set.remove(map.get(i[1]));
        }
        Iterator<TreeNode> it = set.iterator();
        return it.next();
    }
}
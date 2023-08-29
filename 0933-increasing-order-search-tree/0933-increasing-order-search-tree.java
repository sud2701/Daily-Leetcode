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
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<TreeNode> res = new ArrayList<TreeNode>();
        inOrder(root, res);
        int n = res.size();
        root = res.get(0);
        root.left = null;
        TreeNode curr = root;
        TreeNode temp;
        for(int i = 0; i < n; i++){
            temp = res.get(i);
            temp.left = null;
            temp.right = null;
        }
        for(int i = 1; i < n; i++){
            curr.right = res.get(i);
            curr.left = null;
            curr = curr.right;
        }
        return root;
    }

    public void inOrder(TreeNode root, List<TreeNode> res){
        if(root != null){
            if(root.left != null){
                inOrder(root.left, res);
            }
            res.add(root);
            if(root.right != null){
                inOrder(root.right, res);
            }
        }
    }
}
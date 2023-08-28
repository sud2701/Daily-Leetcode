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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
     ArrayList<Integer> list1 = new ArrayList<Integer>();   
     ArrayList<Integer> list2 = new ArrayList<Integer>();
     getLeafNodes(root1, list1);
     getLeafNodes(root2, list2);
     int n1 = list1.size();
     int n2 = list2.size();
     if(n1 == n2){
         for(int i = 0; i < n1; i++){
             if(list1.get(i) != list2.get(i)){
                 return false;
             }
         }
         return true;
     } 
     return false;
    }
    public void getLeafNodes(TreeNode root, ArrayList<Integer> res){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            res.add(root.val);
            return;
        }
        getLeafNodes(root.left, res);
        getLeafNodes(root.right, res);
    }
}
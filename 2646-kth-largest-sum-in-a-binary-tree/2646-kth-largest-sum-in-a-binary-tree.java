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
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        PriorityQueue<Long> minHeap = new PriorityQueue<Long>(k, new Compare());
        int heap_size = 0;
        queue.add(root);
        int queue_size = 1;
        TreeNode curr = root;
        long level_total = 0;
        while(!queue.isEmpty()){
            queue_size = queue.size();
            level_total = 0;
            while(queue_size > 0){
                curr = queue.remove();
                level_total += curr.val;
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
                queue_size--;
            }
            if(heap_size < k){
                minHeap.add(level_total);
                heap_size += 1;
            }
            else {
                if(level_total > minHeap.peek()){
                    minHeap.poll();
                    minHeap.add(level_total);
                }
            }
        }
        if(heap_size < k){
            return -1;
        }
        return minHeap.poll();
    }
}

class Compare implements Comparator<Long> {
    public int compare(Long a, Long b){
        if(a > b){
            return 1;
        }
        else if(a < b){
            return -1;
        }
        else {
            return 0;
        }
    }
}
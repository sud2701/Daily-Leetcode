class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer> ((a,b) -> Integer.compare(a,b));
        int temp;
        for(int i = 0; i < nums.length; i++){
            if(i < k){
                minHeap.add(nums[i]);
            }
            else {
                minHeap.add(nums[i]);
                temp = minHeap.poll();
            } 
        }
        return minHeap.poll();
    }
}
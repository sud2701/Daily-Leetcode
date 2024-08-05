class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        Queue<Integer> queue = new LinkedList<Integer>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>((a, b) -> a - b);
        int total = 0;
        int subtract_index = 0;
        int temp = 0;
        int curr_sub_num = 1;
        int result = 0;
        int curr_elements = n;
        for(int i = 0; i < n; i++) {
            total += nums[i];
            queue.add(total);
        }
        while(subtract_index < n && curr_elements > 0) {
            for(int i = 0; i < curr_elements; i++) {
                temp = queue.remove();
                if(temp - nums[subtract_index] > 0){
                    queue.add(temp - nums[subtract_index]);
                }
                minHeap.add(temp);
            }
            subtract_index++;
            curr_elements--;
        }
        while(curr_sub_num <= right) {
            temp = minHeap.poll();
            if(curr_sub_num >= left) {
                result = (result + temp) % 1_000_000_007;
            }
            curr_sub_num += 1;
        }
        return result;
    }
}
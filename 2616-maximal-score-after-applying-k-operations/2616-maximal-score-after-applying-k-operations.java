class Solution {
    public long maxKelements(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((a, b) -> b - a);
        for(int i = 0; i < n; i++){
            maxHeap.add(nums[i]);
        }
        long result = 0;
        int temp = 0;
        for(int j = 0; j < k; j++){
            temp = maxHeap.poll();
            result += temp;
            if(temp % 3 == 0){
                temp = temp / 3;
            }
            else {
                temp = (temp / 3) + 1;
            }
            maxHeap.add(temp);
        }
        return result;
    }
}
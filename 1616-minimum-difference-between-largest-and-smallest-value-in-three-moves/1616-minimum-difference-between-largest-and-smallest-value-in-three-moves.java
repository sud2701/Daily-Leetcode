class Solution {
    public int minDifference(int[] nums) {
        int n = nums.length;
        if(n <= 4) {
            return 0;
        }
        Arrays.sort(nums);
        int window_len = n - 3;
        int min_diff = nums[n - 1] - nums[0];
        for(int i = 0; i < 4; i++) {
            min_diff = Math.min(min_diff, nums[i + n - 4] - nums[i]);
        }
        return min_diff;
    }
}
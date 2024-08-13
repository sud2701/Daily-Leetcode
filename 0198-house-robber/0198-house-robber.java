class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[n - 1] = nums[n - 1];
        for(int i = n - 2; i >= 0; i--){
            if(i + 2 >= n){
                dp[i] = Math.max(nums[i], dp[i + 1]);
            }
            else {
                dp[i] = Math.max(nums[i] + dp[i + 2], dp[i + 1]);
            }
        }
        return dp[0];
    }
}
class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[n - 1] = 0;
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] == 0){
                dp[i] = Integer.MAX_VALUE;
            }
            else {
                if(i + nums[i] >= n - 1){
                    dp[i] = 1;
                }
                else {
                    dp[i] = n + 1;
                    for(int j = i + 1; j <= i + nums[i] && j < n; j++){
                        if(dp[j] != Integer.MAX_VALUE){
                            dp[i] = Math.min(dp[i], 1 + dp[j]);
                        }
                    }
                }
            }
        }
        return dp[0];
    }
}
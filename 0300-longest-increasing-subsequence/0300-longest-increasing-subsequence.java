class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return 1;
        }
        if(n == 2){
            if(nums[1] > nums[0]){
                return 2;
            }
            else {
                return 1;
            }
        }
        int dp[] = new int[n];
        dp[0] = 1;
        int max_length = 0;
        int res = Integer.MIN_VALUE;
        for(int i = 1; i < n; i++){
            max_length = 1;
            for(int j = i - 1; j >= 0; j--){
                if(nums[j] < nums[i]){
                    if(dp[j] + 1 > max_length){
                        max_length = dp[j] + 1;
                    }
                }
            }
            dp[i] = max_length;
            if(dp[i] > res){
                res = dp[i];
            }
        }
        return res;
    }
}
class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[n - 1];
        }
        if(n == 2){
            return Math.max(Math.max(nums[0], nums[1]), nums[0] * nums[1]);
        }
        // int[][] dp = new int[n][];
        // for(int i = 0; i < n; i++){
        //     dp[i] = new int[n - i];
        // }
        // int max_product = Integer.MIN_VALUE;
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < n - i; j++){
        //         if(j == 0){
        //             dp[i][j] = nums[i];
        //         }
        //         else {
        //             dp[i][j] = dp[i][j - 1] * nums[i + j];
        //         }
        //         if(dp[i][j] > max_product){
        //             max_product = dp[i][j];
        //         }
        //     }
        // }
        // return max_product;
        int max_product = Integer.MIN_VALUE;
        int curr_product = 0;
        for(int i = 0; i < n; i++){
            curr_product = 1;
            for(int j = i; j < n; j++){
                curr_product *= nums[j];
                if(curr_product > max_product){
                    max_product = curr_product;
                }
            }
        }
        return max_product;
    }
}
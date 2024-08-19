class Solution {
    public int minSteps(int n) {
        if(n <= 1){
            return 0;
        }
        int[] dp = new int[n + 1];
        dp[2] = 2;
        for(int i = 2; i <= n; i++){
            dp[i] = i;
            for(int j = i / 2; j >= Math.sqrt(i); j--){
                if(i % j == 0){
                    dp[i] = Math.min(dp[i], dp[j] + i / j);
                }
            }
        }
        return dp[n];
    }
}
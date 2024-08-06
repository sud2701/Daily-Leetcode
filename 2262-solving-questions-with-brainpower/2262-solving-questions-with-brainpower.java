class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n];
        dp[n - 1] = questions[n - 1][0];
        for(int i = n - 2; i >= 0; i--) {
            if(i + questions[i][1] + 1 < n){
                dp[i] = Math.max(dp[i + 1], questions[i][0] + dp[i + questions[i][1] + 1]);
            }
            else {
                dp[i] = Math.max(dp[i + 1], questions[i][0]);
            }
        }
        return dp[0];
    }
}
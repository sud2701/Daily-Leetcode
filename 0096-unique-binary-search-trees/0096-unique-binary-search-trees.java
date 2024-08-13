class Solution {
    public int numTrees(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        int curr = 0;
        for(int i = 3; i <= n; i++){
            curr = 0;
            for(int j = i - 1; j >= 0; j--){
                dp[i] += (dp[j] * dp[curr]);
                curr++;
            }
        }
        return dp[n];
    }
}
class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }
        int curr = 1;
        while(curr < n){
        for(int i = 0; i < n - 1; i++) {
            if(i + curr < n) {
                if(s.charAt(i) == s.charAt(i + curr)){
                    dp[i][i + curr] = 2 + dp[i + 1][i + curr - 1];
                }
                else {
                    dp[i][i + curr] = Math.max(dp[i + 1][i + curr], dp[i][i + curr - 1]);
                }
            }
        }
        curr++;
        }
        return dp[0][n - 1];
    }
}
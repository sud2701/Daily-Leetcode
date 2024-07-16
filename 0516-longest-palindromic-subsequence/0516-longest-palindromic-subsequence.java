class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }
        int curr = 1;
        int j = 0;
        while(curr < n){
        for(int i = 0; i < n - 1; i++) {
            j = i + curr;
            if(j < n) {
                if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = 2 + dp[i + 1][j - 1];
                }
                else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        curr++;
        }
        return dp[0][n - 1];
    }
}
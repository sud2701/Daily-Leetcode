class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        char ch;
        dp[n] = 1;
        if(s.charAt(n - 1) != '0'){
            dp[n - 1] = 1;
        }
        for(int i = n - 2; i >= 0; i--){
            ch = s.charAt(i);
            if(ch == '0'){
                continue;
            }
            else if(ch > '2'){
                dp[i] = dp[i + 1];
            }
            else {
                if(ch == '2' && s.charAt(i + 1) > '6'){
                    dp[i] = dp[i + 1];
                }
                else {
                    dp[i] = dp[i + 1] + dp[i + 2];
                }
            }
        }
        return dp[0];
    }
}
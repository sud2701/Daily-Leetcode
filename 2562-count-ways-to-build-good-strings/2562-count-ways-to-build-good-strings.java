class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int[] dp = new int[high + 1];
        int i = 0;
        dp[0] = 1;
        int result = 0;
        int divisor = 1_000_000_007;
        for(i = 1; i <= high; i++) {
            if(i - one >= 0){
                dp[i] = (dp[i] + dp[i - one]) % divisor;
            }
            if(i - zero >= 0) {
                dp[i] = (dp[i] + dp[i - zero]) % divisor;
            }
            if(i >= low) {
                result = (result + dp[i]) % divisor;
            }
        }
        return result % divisor;
    }
}
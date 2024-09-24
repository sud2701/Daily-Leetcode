class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        int[] dp = new int[n + 1];
        dp[n - 1] = Math.min(costs[0], Math.min(costs[1], costs[2]));
        int i = n - 2;
        int j = 0;
        boolean week_crossed = false;
        while(i >= 0){
            dp[i] = costs[0] + dp[i + 1];
            j = i + 1;
            week_crossed = false;
            while(days[j] < days[i] + 30){
                if(!week_crossed && days[j] >= days[i] + 7){
                    week_crossed = true;
                    dp[i] = Math.min(dp[i], costs[1] + dp[j]);
                }
                j++;
                if(j == n){
                    if(week_crossed){
                        dp[i] = Math.min(dp[i], costs[2]);
                    }
                    else {
                        dp[i] = Math.min(dp[i], Math.min(costs[1], costs[2]));
                    }
                    break;
                }
            }
            dp[i] = Math.min(dp[i], costs[2] + dp[j]);
            i--;
        }
        return dp[0];
    }
}
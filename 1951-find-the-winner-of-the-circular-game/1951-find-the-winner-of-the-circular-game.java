class Solution {
    public int findTheWinner(int n, int k) {
        boolean[] visited = new boolean[n + 1];
        int count = n;
        int curr = 1;
        int curr_cycle = 0;
        while(count > 1) {
            curr_cycle = 0;
            while(curr_cycle < k) {
                if(!visited[curr]) {
                    curr_cycle += 1;
                }
                curr += 1;
                if(curr > n) {
                    curr %= n;
                }
            }
            if(curr - 1 == 0) {
                visited[n] = true;
            }
            else {
                visited[curr - 1] = true;
            }
            count -= 1;
        }
        for(int i = 1; i <= n; i++) {
            if(!visited[i]){
                return i;
            }
        }
        return -1;
    }
}
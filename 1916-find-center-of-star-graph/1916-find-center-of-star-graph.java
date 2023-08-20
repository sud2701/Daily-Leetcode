class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length + 1;
        int[] count = new int[n + 1];
        int i = 0;
        for(i = 0; i < n - 1; i++){
            count[edges[i][0]]++;
            count[edges[i][1]]++;
        }
        for(i = 1; i <= n; i++){
            if(count[i] == n - 1) return i;
        }
        return -1;
    }
}
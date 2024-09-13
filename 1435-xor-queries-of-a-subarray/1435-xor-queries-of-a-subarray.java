class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int m = queries.length;
        int[] prefix_xor = new int[n];
        int[] result = new int[m];
        int curr_xor = 0;
        for(int i = 0; i < n; i++){
            curr_xor = curr_xor ^ arr[i];
            prefix_xor[i] = curr_xor;
        }
        for(int i = 0; i < m; i++){
            if(queries[i][0] == 0){
                result[i] = prefix_xor[queries[i][1]];
            }
            else {
                result[i] = prefix_xor[queries[i][1]] ^ prefix_xor[queries[i][0] - 1];
            }
        }
        return result;
    }
}
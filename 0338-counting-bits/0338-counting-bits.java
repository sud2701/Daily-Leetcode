class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        int count = 0;
        int temp;
        for(int i = 0; i <= n; i++){
            count = 0;
            temp = i;
            while(temp > 0){
                if(temp % 2 == 1){
                    count += 1;
                }
                temp /= 2;
            }
            ans[i] = count;
        }
        return ans;
    }
}
class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        long sum = 0;
        long[] sums = new long[n];
        for(int i = 0; i < n; i++){
            sum = sum + nums[i];
            sums[i] = sum;
        }
        if(sum % p == 0){
            return 0;
        }
        int subArrayLength = 1;
        while(subArrayLength < n){
            for(int i = 0; i <= n - subArrayLength; i++){
                if((sum - sums[i + subArrayLength - 1] + sums[i] - nums[i]) % p == 0){
                    return subArrayLength;
                }
            }
            subArrayLength++;
        }
        return -1;
    }
}
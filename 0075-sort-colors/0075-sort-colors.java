class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int min;
        for(int i = 0; i < n - 1; i++){
            min = i;
            for(int j = i + 1; j < n; j++){
                if(nums[j] < nums[min]){
                    min = j;
                }
            }
            if(min != i){
                nums[i] = nums[i] + nums[min];
                nums[min] = nums[i] - nums[min];
                nums[i] = nums[i] - nums[min];
            }
        }
    }
}
class Solution {
    public void sortColors(int[] nums) {
        // int n = nums.length;
        // int min;
        // for(int i = 0; i < n - 1; i++){
        //     min = i;
        //     for(int j = i + 1; j < n; j++){
        //         if(nums[j] < nums[min]){
        //             min = j;
        //         }
        //     }
        //     if(min != i){
        //         nums[i] = nums[i] + nums[min];
        //         nums[min] = nums[i] - nums[min];
        //         nums[i] = nums[i] - nums[min];
        //     }
        // }

        int n = nums.length;
        for(int i = 1; i < n; i++){
            if(nums[i] < nums[i - 1]){
                while(i > 0 && nums[i] < nums[i - 1]){
                    nums[i] = nums[i] + nums[i - 1];
                    nums[i - 1] = nums[i] - nums[i - 1];
                    nums[i] = nums[i] - nums[i - 1];
                    i -= 1;
                }
            }
        }
    }
}
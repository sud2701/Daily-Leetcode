class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int frequency = 1;
        int last_index = 0;
        int k = 0;
        for(int i = 1; i < n; i++){
            if(nums[i] == nums[last_index]){
                frequency++;
            }
            else {
                if(frequency > 2){
                    k += 2;
                }
                else {
                    k += frequency;
                }
                frequency = 1;
                last_index = i;
            }
            if(frequency >= 3){
                nums[i] = 100000;
            }
        }
        if(frequency > 2){
            k += 2;
        }
        else {
            k += frequency;
        }
        Arrays.sort(nums);
        return k;
    }
}
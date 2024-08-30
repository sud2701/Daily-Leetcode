class Solution {
    public int removeDuplicates(int[] nums) {
        int update_position = 1;
        int i = 1;
        int n = nums.length;
        while(i < n){
            if(nums[i] > nums[i - 1]){
                nums[update_position] = nums[i];
                update_position += 1;
            }
            i++;
        }
        return update_position;
    }
}
class Solution {
    public void sortColors(int[] nums) {
        int[] freqs = new int[3];
        for(int i : nums) {
            freqs[i] += 1;
        }
        int n = nums.length;
        int curr_index = 0;
        for(int i = 0; i < n; i++) {
            while(freqs[curr_index] == 0){
                curr_index++;
            } 
            nums[i] = curr_index;
            freqs[curr_index]--;
        }
    }
}
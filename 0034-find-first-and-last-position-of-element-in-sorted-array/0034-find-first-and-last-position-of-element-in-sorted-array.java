class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        boolean flag = false;
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int mid = 0;
        while(start <= end) {
            mid = (start + end) / 2;
            if(nums[mid] == target) {
                flag = true;
                break;
            }
            else if(nums[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        if(!flag){
            return result;
        }
        start = mid;
        end = mid;
        while(start > 0 && nums[start - 1] == nums[start]){
            start -= 1;
        }
        while(end < n - 1 && nums[end + 1] == nums[end]){
            end += 1;
        }
        result[0] = start;
        result[1] = end;
        return result;
    }
}
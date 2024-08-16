class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        boolean even = ((m + n) % 2 == 0);
        int mid = (m + n) / 2;
        double average = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int added_value = 0;
        while(count <= mid){
            if(i == m){
                added_value = nums2[j];
                j++;
            }
            else if(j == n){
                added_value = nums1[i];
                i++;
            }
            else if(nums1[i] < nums2[j]){
                added_value = nums1[i];
                i++;
            }
            else if(nums1[i] >= nums2[j]){
                added_value = nums2[j];
                j++;
            }
            if(count == mid - 1 && even){
                average = (double)average + added_value;
            }
            if(count == mid){
                average = (double)average + added_value;
            }
            count++;
        }
        if(even) {
            return average / 2.0;
        }
        return average;
    }
}
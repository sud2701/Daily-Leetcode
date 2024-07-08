class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int start = 0;
        int end = n - 1;
        int maxArea = 0;
        int minHeight = 0;
        while(start < end) {
            minHeight = Math.min(height[start], height[end]);
            maxArea = Math.max(maxArea, minHeight * (end - start));
            if(minHeight == height[start]) {
                start++;
            }
            else {
                end--;
            }
        }
        return maxArea;
    }
}
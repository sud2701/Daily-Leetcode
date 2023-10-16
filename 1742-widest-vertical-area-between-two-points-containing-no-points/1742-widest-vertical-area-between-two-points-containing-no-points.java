class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a,b) -> a[0] - b[0]);
        int max_width = 0;
        int n = points.length;
        for(int i = 1; i < n; i++){
            if(Math.abs(points[i][0] - points[i - 1][0]) > max_width){
                max_width = Math.abs(points[i][0] - points[i - 1][0]);
            }
        }
        return max_width;
    }
}
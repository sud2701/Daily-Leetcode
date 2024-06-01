class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int min_diagonal = 0;
        for(int i = 0; i < m; i++){
            if(matrix[i][0] == target || matrix[i][n - 1] == target){
                return true;
            }
            else if (matrix[i][0] < target && matrix[i][n - 1] > target){
                for(int j = 1; j < n - 1; j++) {
                    if(matrix[i][j] == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
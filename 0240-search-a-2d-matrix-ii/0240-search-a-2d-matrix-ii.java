class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // int m = matrix.length;
        // int n = matrix[0].length;
        // int max_row = m - 1;
        // int max_col = n - 1;
        // int min_row = 0;
        // int min_col = 0;
        // int i;
        // for(i = 0; i < m && i < n; i++) {
        //     if(matrix[i][i] == target){
        //         return true;
        //     }
        //     else if(matrix[i][i] > target){
        //         max_row = i;
        //         max_col = i;
        //         break;
        //     }
        //     else {
        //         min_col = i;
        //         min_row = i;
        //     }
        // }
        // if(i == m && i < n) {
        //     while(i < n){
        //         if(matrix[max_row][i] == target){
        //             return true;
        //         }
        //         else if(matrix[max_row][i] > target){
        //             max_col = i;
        //             break;
        //         }
        //         else {
        //             min_row = max_row;
        //             min_col = i;
        //         }
        //         i++;
        //     }
        // }
        // else if(i == n && i < m) {
        //     while(i < m) {
        //         if(matrix[i][max_col] == target){
        //             return true;
        //         }
        //         else if(matrix[i][max_col] > target){
        //             max_row = i;
        //             break;
        //         }
        //         else {
        //             min_col = max_col;
        //             min_row = i;
        //         }
        //         i++;
        //     }
        // }
        // for(i = min_row; i <= max_row; i++){
        //     for(int j = min_col; j <= max_col; j++){
        //         if(matrix[i][j] == target){
        //             return true;
        //         }
        //     }
        // }
        // return false;

        int m = matrix.length;
        int n = matrix[0].length;

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
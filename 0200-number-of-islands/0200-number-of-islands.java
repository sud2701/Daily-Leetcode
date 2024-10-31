class Solution {
    char[][] fullGrid;
    boolean[][] visited;
    int rows;
    int cols;
    public int numIslands(char[][] grid) {
        fullGrid = grid;
        rows = grid.length;
        cols = grid[0].length;
        visited = new boolean[rows][cols];
        int result = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(!visited[i][j] && grid[i][j] == '1'){
                    result += 1;
                    dfs(i, j);
                }
            }
        }
        return result;
    }

    public void dfs(int i, int j){
        visited[i][j] = true;
        if(i + 1 < rows && fullGrid[i + 1][j] == '1' && !visited[i + 1][j]){
            dfs(i + 1, j);
        }
        if(i - 1 >= 0 && fullGrid[i - 1][j] == '1' && !visited[i - 1][j]){
            dfs(i - 1, j);
        }
        if(j + 1 < cols && fullGrid[i][j + 1] == '1' && !visited[i][j + 1]){
            dfs(i, j + 1);
        }
        if(j - 1 >= 0 && fullGrid[i][j - 1] == '1' && !visited[i][j - 1]){
            dfs(i, j - 1);
        }
    }
}
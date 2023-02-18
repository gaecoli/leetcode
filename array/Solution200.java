class Solution200 {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }

    void dfs(char[][] grid, int row, int col) {
        // 不在还在网格以内；
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == '0' || grid[row][col] == '2') {
            return;
        }
        // 还在网格以内；
        grid[row][col] = '2';
        dfs(grid, row - 1, col);
        dfs(grid, row + 1, col);
        dfs(grid, row, col - 1);
        dfs(grid, row, col + 1);
    }
}
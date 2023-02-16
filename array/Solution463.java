class Solution463 {
    // 解法一
    public int islandPerimeter(int[][] grid) {
        int land = 0, border = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    land++;

                    if (i < grid.length - 1 && grid[i+1][j] == 1) {
                        border++;
                    }

                    if (j < grid[0].length - 1 && grid[i][j+1] == 1) {
                        border++;
                    }
                }
            }
        }

        // 岛屿中不可以存在湖才会有用
        return 4 * land - 2 * border;
    }

    // 解法二
    public int islandPerimeterDfs(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                // 必须存在一个岛屿
                if (grid[i][j] == 1) {
                    return dfs(grid, i, j);
                }
            }
        }

        return 0;
    }

    // 存在岛屿的情况
    int dfs(int[][] grid, int row, int col) {
        // 走到边缘 (走到上下左右四个边则周长为 1)
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length) {
            return 1;
        }

        // 走到湖泊（走到湖泊相当于走到了边，所以周长也为 1）
        if (grid[row][col] == 0) {
            return 1;
        }

        // 走到已经访问过的
        if (grid[row][col] == 2) {
            return 0;
        }

        grid[row][col] = 2;

        // 从某个点出发，每个格子的上下左右都要走一遍
        return dfs(grid, row, col - 1) + dfs(grid, row, col + 1) + dfs(grid, row - 1, col) + dfs(grid, row + 1, col);
    }
}
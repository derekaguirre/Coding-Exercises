package Completed.Graphs.DFS;

//Submission: https://leetcode.com/problems/number-of-closed-islands/submissions/1090316343/

public class NumberOfClosedIslands {
    public static void main(String[] args) {
        int[][] grid = {
                { 1, 1, 1, 1, 1, 1, 1, 0 },
                { 1, 0, 0, 0, 0, 1, 1, 0 },
                { 1, 0, 1, 0, 1, 1, 1, 0 },
                { 1, 0, 0, 0, 0, 1, 0, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 0 }
        };
        closedIsland(grid);
    }

    public static int closedIsland(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0) {
                    // Run DFS on first instance of land
                    if (isClosed(grid, i, j))
                        count++;
                }
            }
        }
        return count;
    }

    public static boolean isClosed(int[][] grid, int row, int col) {
        // Verify that the traversal is still inside the bounds
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[row].length)
            return false;

        // If the value is 1 then the path does not need to be traversed anymore
        if (grid[row][col] == 1 || grid[row][col] == -1)
            return true;

        // Change the value to -1 to mark as visited
        grid[row][col] = -1;

        // Recursively run on adjacent cells
        boolean left = isClosed(grid, row, col - 1);
        boolean right = isClosed(grid, row, col + 1);
        boolean up = isClosed(grid, row - 1, col);
        boolean down = isClosed(grid, row + 1, col); 

        // Returns true if all traversals never leave bounds
        return left && right && up && down;
    }

}

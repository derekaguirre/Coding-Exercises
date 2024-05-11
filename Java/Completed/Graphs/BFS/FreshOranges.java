package Completed.Graphs.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class FreshOranges {

    public static void main(String[] args) {
        int[][] grid = { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };
        orangesRotting(grid);
    }

    // BFS: Add all rotten oranges in a level and for every rotten orange, update
    // adjacent oranges to rotten repeat until all fresh oranges are exhausted
    public static int orangesRotting(int[][] grid) {

        // Check if the grid is empty
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        // Set up variables that will be used in the algo
        int rows = grid.length;
        int columns = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshOranges = 0;

        // Traverse through the grid, queue up the rotten oranges and keep count of all
        // the fresh oranges
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[] { i, j }); // Queue up the rotten ones
                }
                if (grid[i][j] == 1) {
                    freshOranges++; // If the count of fresh oranges is > 0 then there is an unreachable orange
                }
            }
        }

        int days = 0;
        // all the possible adjacent directions of a grid value
        int[][] directions = new int[][] { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

        //Check if the queue is not empty and that there are still fresh oranges remaining
        while (!queue.isEmpty() && freshOranges > 0) { 
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                int[] node = queue.poll();
                for (int[] dir : directions) {
                    int x = node[0] + dir[0];
                    int y = node[1] + dir[1];

                    // exceeded the boundary or the grid value is not a fresh orange, in that case
                    // just continue the loop
                    if (x < 0 || y < 0 || x >= rows || y >= columns || grid[x][y] == 0 || grid[x][y] == 2) {
                        continue;
                    }
                    grid[x][y] = 2; // mark the orange from fresh -> rotten
                    queue.offer(new int[] { x, y }); // add the rotten orange to queue
                    freshOranges--;
                }
            }
            days++; // increment the level
        }
        return freshOranges == 0 ? days : -1; // fact that there are no fresh oranges in the grid means all the fresh
                                              // oranges in the grid have been rotten
    }
}
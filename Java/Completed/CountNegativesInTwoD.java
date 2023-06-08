package Completed;

//Submission: https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/submissions/966324766/

public class CountNegativesInTwoD {
    public static void main(String[] args) {
        int[][] grid = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };

        System.out.println(countNegativesBSearch(grid));
    }

    // Naive Approach
    public static int countNegatives(int[][] grid) {
        int counter = 0;
        for (int rows = 0; rows < grid.length; rows++) {
            for (int cols = 0; cols < grid[rows].length; cols++) {
                if (grid[rows][cols] < 0)
                    counter++;
            }
        }
        return counter;
    }

    // Binary Search Approach
    public static int countNegativesBSearch(int[][] grid) {
        int count = 0;
        for (int row = 0; row < grid.length; row++) {
            int start = 0, end = grid[row].length - 1;

            while (start <= end) {
                int mid = (start + end) / 2;

                if (grid[row][mid] < 0) {
                    count = count + (end - mid) + 1;
                    end = mid - 1;
                } else
                    start = mid + 1;
            }
        }
        return count;
    }
}

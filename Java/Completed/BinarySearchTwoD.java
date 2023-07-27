package Completed;

//Submission: https://leetcode.com/problems/search-a-2d-matrix/submissions/1005482029/

public class BinarySearchTwoD {
    public static void main(String[] args) {
        // int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int[][] matrix = { { 1 } };

        System.out.println(searchMatrix(matrix, 3));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int low = 0, high = matrix.length - 1, row = 0;
        while (low <= high) {
            row = low + (high - low) / 2;
            int test = matrix[row][matrix[0].length - 1];
            if (target > test)
                low = row + 1;
            else if (target < matrix[row][0])
                high = row - 1;
            else
                break;
        }
        if (low > high)
            return false;

        low = 0;
        high = matrix[0].length - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (target > matrix[row][mid])
                low = mid + 1;
            else if (target < matrix[row][mid])
                high = mid - 1;
            else
                return true;
        }
        return false;
    }
}

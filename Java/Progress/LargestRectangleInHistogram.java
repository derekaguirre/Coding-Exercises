package Progress;

//Problem: https://leetcode.com/problems/largest-rectangle-in-histogram/

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        // int[] heights = { 0, 8 };
        // int[] heights2 = { 1 };
        // int[] heights3 = { 2,1,2};
        // int[] heights4 = { 1, 2, 3, 4, 5 };
        int[] heights5 = { 5, 4, 3, 2, 1 };

        System.out.println(largestRectangleArea(heights5));
    }

    // For every pair get the absolute difference
    // Subtract it from:
    // sum of the two numbers
    // the highest number
    // then mult the two nums and store it in a max int variable
    // return max
    public static int largestRectangleArea(int[] heights) {
        if (heights.length == 0)
            return 0;
        if (heights.length == 1)
            return heights[0];
        int pointer2 = 1;
        int calc = 0;
        int max = 0;
        // Checking area of the vertical bars
        for (int i = 0; pointer2 < heights.length; i++, pointer2++) {
            // Handle if any of the numbers are 0, sum normally
            if (heights[i] == 0 || heights[pointer2] == 0)
                calc = heights[pointer2] + heights[i];

            // Handle non-zero numbers, Equalize the numbers and get sum
            if (heights[i] != 0 && heights[pointer2] != 0) {
                int diff = Math.abs(heights[i] - heights[pointer2]);
                if (heights[i] < heights[pointer2])
                    calc = heights[i] - diff + heights[pointer2];
                else
                    calc = heights[pointer2] - diff + heights[i];
            }
            // Keep track of max
            max = Math.max(calc, max);
        }

        // Calculate max horizontal area by going backwards
        int horizontalMax = 0;
        int horizontalArea = 0;
        for (int i = heights.length - 1; i > 0; i--) {
            // Handle zeroes
            if (heights[i] == 0)
                continue;
            // Handle non-zero numbers by mult the last
            if (heights[i] != 0) {
                horizontalArea = heights[i] * (heights.length - i);
                horizontalMax = Math.max(horizontalMax, horizontalArea);

            }
        }
        max = Math.max(horizontalMax, max);

        return max;
    }


    public static int largestRectangleArea2(int[] heights) {
        return 0;
    }
}

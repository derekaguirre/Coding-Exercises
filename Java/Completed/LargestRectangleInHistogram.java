package Completed;

import java.util.Stack;

//Submission: https://leetcode.com/problems/largest-rectangle-in-histogram/submissions/1003073341/

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        // int[] heights = { 0, 8 };
        // int[] heights2 = { 1 };
        // int[] heights3 = { 2,1,2};
        // int[] heights4 = { 1, 2, 3, 4, 5 };
        int[] heights5 = { 5, 4, 3, 2, 1 };

        System.out.println(largestRectangleArea2(heights5));
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

    public static int largestRectangleArea2(int[] h) {
        int n = h.length, i = 0, max = 0;
        Stack<Integer> s = new Stack<>();
        while (i < n) {
            // as long as the current bar is shorter than the last one in the stack
            // (monotonic increasing order)
            // we keep popping out the stack and calculate the area based on the popped bar
            // while its not empty and the current box is smaller than the box in the stack
            while (!s.isEmpty() && h[i] < h[s.peek()]) {
                // handle the index of the left bound
                max = Math.max(max, h[s.pop()] * (i - (s.isEmpty() ? 0 : s.peek() + 1)));
            }
            // put current box's index to the stack
            s.push(i++);
        }
        // finally pop out any bar left in the stack and calculate the area based on it
        while (!s.isEmpty()) {
            max = Math.max(max, h[s.pop()] * (n - (s.isEmpty() ? 0 : s.peek() + 1)));
        }
        return max;
    }
}

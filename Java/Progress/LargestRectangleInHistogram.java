package Progress;

//Problem: https://leetcode.com/problems/largest-rectangle-in-histogram/

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        int[] heights = {2,4};
        System.out.println(largestRectangleArea(heights));
    }
    // For every pair get the absolute difference
    // Subtract it from:
    // sum of the two numbers
    // the highest number
    // then mult the two nums and store it in a max int variable
    // return max
    public static int largestRectangleArea(int[] heights) {
        if(heights.length == 0)
        return 0;
        if(heights.length == 1)
        return heights[0];
        int pointer2 = 1;
        int product = 0;
        int max = 0;
        for (int i = 0; pointer2 < heights.length; i++, pointer2++) {
            int diff = Math.abs(heights[i] - heights[pointer2]);
            // Equalize the numbers and get product
            if (heights[i] < heights[pointer2])
                product = heights[i] * 2;
            else
                product = heights[pointer2] * 2;
            //Keep track of max
            max = Math.max(product, max);
        }
        return max;
    }
}

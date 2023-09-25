package Completed.Math;

import java.util.Arrays;

//Submission: https://leetcode.com/problems/find-the-value-of-the-partition/submissions/1055079843/

public class FindTheValueOfThePartition {
    public static void main(String[] args) {
        int[] nums = { 1,100, };
        System.out.println("FINAL EVAL: " + findTheValueOfThePartition(nums));
    }

    public static int findTheValueOfThePartition(int[] nums) {
        Arrays.sort(nums);
        int val = Integer.MAX_VALUE;
        //Prevent out of bounds
        for (int i = 0; i <= nums.length - 2; i++) {
            // Partition the two numbers
            int eval =  nums[i + 1] - nums[i];
            //Keep track of the min value of the evaluations
            val = Math.min(eval, val);
        }
        return val;
    }
}

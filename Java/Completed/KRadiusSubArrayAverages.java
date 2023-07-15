package Completed;

import java.util.Arrays;

//Submission: https://leetcode.com/problems/k-radius-subarray-averages/submissions/975237800/

public class KRadiusSubArrayAverages {
    public static void main(String[] args) {
        int[] nums = { 7, 4, 3, 9, 1, 8, 5, 2, 6 };
        int k = 3;

        int[] res = getAverages(nums, k);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] getAverages(int[] nums, int k) {
        int[] tmp = new int[nums.length];
        Arrays.fill(tmp, -1);
        // k represents the center
        int subArrayLen = k * 2 + 1;
        int slowPointer = 0;
        long sum = 0l;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            // If window reaches the end of the sub array then calculate avg
            if (i - slowPointer + 1 >= subArrayLen) {
                tmp[k + slowPointer] = (int) sum / subArrayLen;
                // Move the window by taking out the first summed value and moving pointer
                sum -= nums[slowPointer];
                slowPointer++;
            }
        }
        return tmp;
    }
}

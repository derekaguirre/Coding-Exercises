package Completed.TwoPointers.SlidingWindow;

import java.util.ArrayDeque;
import java.util.Deque;

//Submission: https://leetcode.com/problems/sliding-window-maximum/submissions/1066469106/

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        int[] result = maxSlidingWindowOptimal(nums, k);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0)
            return new int[0];

        int[] res = new int[nums.length - k + 1];
        int left = 0, right = k, max;
        // loop through nums
        while (right <= nums.length) {
            max = Integer.MIN_VALUE;
            // for every window I will loop through the window to find the highest value
            for (int i = left; i < right; i++) {
                max = Math.max(max, nums[i]);
            }
            // add the highest value to the result array and move the window until k reaches
            // end of arr
            res[left] = max;
            left++;
            right++;
        }
        return res;
    }

    public static int[] maxSlidingWindowOptimal(int[] nums, int k) {
        if (nums == null || k <= 0)
            return new int[0];

        int[] res = new int[nums.length - k + 1];
        int ri = 0;
        // Double ended queue to store index, can insert and remove on both sides
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            // remove numbers out of range k
            while (!queue.isEmpty() && queue.peek() < i - k + 1)
                queue.poll();

            // remove smaller numbers in k range as they are useless
            while (!queue.isEmpty() && nums[queue.peekLast()] < nums[i])
                queue.pollLast();

            // queue contains index... res contains content
            queue.offer(i);
            if (i >= k - 1) {
                res[ri++] = nums[queue.peek()];
            }
        }
        return res;
    }
}

package Completed.Array;

//Submission: https://leetcode.com/problems/jump-game/submissions/1088018820/

public class JumpGame {
    public static void main(String[] args) {
        int[] nums3 = { 2, 5, 0, 0 };

        System.out.println(canJump(nums3));
    }

    // Sol O(n)
    public static boolean canJump(int[] nums) {
        int jumps = 0;
        // System.out.println("start: " + jumps);
        for (int i = 0; i < nums.length;) {
            // System.out.println("curr: " + i);
            jumps += nums[i];
            if (jumps > nums.length - 1)
                return true;
            i = jumps;
            // System.out.println("in: " + jumps);
            if (nums[jumps] == 0 && jumps != (nums.length - 1))
                return false;
            if (nums[jumps] == nums[nums.length - 1])
                return true;
        }
        return false;
    }

    //Solution
    public static boolean canJump2(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false; // Cannot reach the current position
            }
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach >= nums.length - 1) {
                return true; // Can reach the end
            }
        }
        return false;
    }
}

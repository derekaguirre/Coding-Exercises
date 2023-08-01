package Completed.Array;

//Submission https://leetcode.com/submissions/detail/947534864/

class RunningSumArray {
    public int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
}
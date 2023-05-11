package Completed;

import java.util.Arrays;

//Submission: https://leetcode.com/submissions/detail/778118491/

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return false;
        }
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }
}

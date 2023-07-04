package Completed;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Submission: https://leetcode.com/problems/contains-duplicate/submissions/985780021/

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

    public static boolean containsDuplicateAttempt2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else
                map.put(nums[i], map.get(nums[i])+1);

            if(map.get(nums[i]) > 1)
                return true;
        }
        return false;
    }
}

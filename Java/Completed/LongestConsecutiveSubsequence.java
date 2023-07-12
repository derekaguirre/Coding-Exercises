package Completed;

import java.util.HashSet;
import java.util.Set;

//Submission: https://leetcode.com/problems/longest-consecutive-sequence/submissions/992935430/

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int[] nums = { 100, 4, 200, 1, 3, 2 };
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        int longest = 0;
        //Populate set
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++)
            set.add(nums[i]);
        
        //Iterate through original list to build sequences
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            
            //Check if a number exists both before and after
            //If so then increment counter and remove current number from consideration
            int curr = nums[i];
            while(set.contains(--curr)){
                count++;
                set.remove(curr);
            }
            curr = nums[i];
            while(set.contains(++curr)){
                count++;
                set.remove(curr);
            }
            //Keep track of current longest counter
            longest = Math.max(longest, count);
        }
        return longest;
    }
}

package Completed.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Submission: https://leetcode.com/problems/3sum/submissions/1004879710/

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int p1 = i + 1;
            int p2 = nums.length - 1;
            while (p1 < p2) {
                int sum = nums[i] + nums[p1] + nums[p2];
                if (sum == 0) {
                    ArrayList<Integer> sp = new ArrayList<>();
                    sp.add(nums[i]);
                    sp.add(nums[p1]);
                    sp.add(nums[p2]);

                    ans.add(sp);
                    p1++;
                } 
                else if (sum < 0)
                    p1++;
                else
                    p2--;

            }
        }
        return new ArrayList<>(ans);
    }

}

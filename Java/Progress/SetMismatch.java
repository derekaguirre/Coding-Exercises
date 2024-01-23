package Progress;

import java.util.HashSet;
import java.util.Set;

//Submission: https://leetcode.com/problems/set-mismatch/submissions/1154112199

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = { 1,2,2,4};
        int[] res = findErrorNums(nums);
        System.out.println(res[0] + ", " + res[1]);
    }

    public static int[] findErrorNums(int[] nums) {
        Set<Integer> set = new HashSet<Integer>(nums.length + 1);
        int dup = 0;

        // Populate the set with enumerated values
        // Find the value of the duplicate number
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                dup = nums[i];
            }
            set.add(nums[i]);
        }

        // Traverse original array to find the location of the duplicate
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return new int[] { dup, i };
            }
        }

        return new int[]{};
    }
}

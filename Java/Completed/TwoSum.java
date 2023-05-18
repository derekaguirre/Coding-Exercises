package Completed;
import java.util.HashMap;
import java.util.Map;

//Problem: https://leetcode.com/problems/two-sum/
//Submission: https://leetcode.com/submissions/detail/9524931s39/

public class TwoSum {
    // public static void main(String[] args) {
    //     int[] a = { 2, 7, 11, 15 }; // 9
    //     int[] b = { 3, 2, 4 }; // 6
    //     int[] c = {-1,-2,-3,-4,-5}; // -8
    //     int[] d = {150,24,79,50,88,345,3}; // 200

    //     for(int i: twoSum(d, 200)){
    //         System.out.println(i);
    //     }
    // }


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { i, map.get(complement) };
            }
            map.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}

package Progress;

import java.util.Map;
import java.util.HashMap;

//Submission: https://leetcode.com/problems/majority-element/submissions/972359584/

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        Map<Integer, Integer> map = new HashMap<>();
        // Add mappings of elements to their occurrences
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else
                map.put(nums[i], map.get(nums[i]) + 1);
        }

        int element = 0;
        int maxValue = 0;
        // Save the key of the highest occurrence to return
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                element = entry.getKey();
            }
        }
        return element;
    }
}

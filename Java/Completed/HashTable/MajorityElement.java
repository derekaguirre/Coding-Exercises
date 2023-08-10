package Completed.HashTable;

import java.util.Map;
import java.util.HashMap;

//Submission: https://leetcode.com/problems/majority-element/submissions/972359584/

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement2(new int[] { 2, 2, 3, 1, 1, 1, 2, 2 }));
    }

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

    public static int majorityElement2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else
                map.put(nums[i], map.get(nums[i]) + 1);
        }
        int majorityKey = 0;
        int majorityVal = 0;
        for (int key : map.keySet()) {
            if (map.get(key) > majorityVal){
                majorityKey = key;
                majorityVal = map.get(key);
            }
        }
        return majorityKey;
    }
}

package Progress;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Submission: https://leetcode.com/problems/top-k-frequent-elements/submissions/987431265/

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;

        topKFrequent(nums, k);
    }

    public static int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] frequency = new List[nums.length + 1];
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList();

        // Store occurrences in the hash map O(n)
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]) + 1);
            else
                map.put(nums[i], 1);
        }

        // Save into a new int[] list where we store the values in
        // If a value occurred 2 times, then store in index 2, etc.
        for (int key : map.keySet()) {
            if (frequency[map.get(key)] == null)
                // Create a new arraylist to store the value if it does not exist in the index
                frequency[map.get(key)] = new ArrayList<Integer>();
            frequency[map.get(key)].add(key);
        }

        // Iterate through the frequency array backwards (since it is in order from
        // smallest to biggest) and take the first k non-null elements
        // Loop is bound to k biggest elements.
        for (int i = frequency.length-1; i >= 0 && result.size() < k; i--) {
            if(frequency[i] != null)
                result.addAll(frequency[i]);
        }

        return result.stream().mapToInt(i->i).toArray();
    }
}

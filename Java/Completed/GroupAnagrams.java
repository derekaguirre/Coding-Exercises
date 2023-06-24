package Completed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Submission: https://leetcode.com/problems/group-anagrams/submissions/978293354/

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        groupAnagrams2(strs);
    }

    public static List<List<String>> groupAnagrams2(String[] strs) {
        if(strs.length == 0 || strs == null)
            return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        // Pushes a mapping of a string and an accompanying list
        for (int i = 0; i < strs.length; i++) {

            char[] charArr = strs[i].toCharArray();
            //O(n * log(n))
            Arrays.sort(charArr);
            String sortedStr = new String(charArr);
            
            // If the summation of chars does not exist, make a new list
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            // Add string to corresponding list
            map.get(sortedStr).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}

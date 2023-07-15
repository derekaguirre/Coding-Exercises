package Progress;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Problem: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>(); 
        char[] charArr = s.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            if(map.containsKey(s.charAt(i))){

            }
        }

        return 0;
    }

    
    public int lengthOfLongestSubstring2(String s) {
        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();
        
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }
        
        return max;
    }
}


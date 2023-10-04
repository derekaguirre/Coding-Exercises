package Completed.TwoPointers.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

//Submission: https://leetcode.com/problems/minimum-window-substring/submissions/1066422160/

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }

    public static String minWindow(String s, String t) {
        // edge cases
        if (s == null || s.length() < t.length() || s.length() == 0) {
            return "";
        }

        // Populate map with t
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        }
        // mapCounter = 0 marks the end of the algo meaning all chars are found w/ min substr
        int missingChars = map.size();
        int left = 0, right = 0; // two pointers
        int start = 0, maxLen = 0;

        //
        for (right = 0; right < s.length(); right++) {
            // If character is found in map, decrease count, when count is 0 we found a char
            if (map.containsKey(s.charAt(right))) {
                map.put(s.charAt(right), map.get(s.charAt(right)) - 1);
                if (map.get(s.charAt(right)) == 0)
                    missingChars--;

                // No more missing chars
                if (missingChars == 0) {
                    // Move left pointer to find a potential smaller substring
                    while (left < s.length() && missingChars == 0) {
                        // If char is found in map, increase count, when count is above 0 we are missing a char
                        if (map.containsKey(s.charAt(left))) {
                            map.put(s.charAt(left), map.get(s.charAt(left)) + 1);
                            if (map.get(s.charAt(left)) > 0)
                                missingChars++;
                        }
                        left++;
                    }
                    // Update maxLen and start pointer to find a potential smaller substring
                    if (maxLen > right - left + 2 || maxLen == 0) {
                        maxLen = (right - left) + 2;
                        start = left - 1;
                    }
                }
            }
        }
        return s.substring(start, start + maxLen);
    }
}
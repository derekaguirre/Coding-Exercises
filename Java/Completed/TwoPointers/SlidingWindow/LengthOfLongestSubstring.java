package Completed.TwoPointers.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

//Submission: https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/1008946760/

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int slow = 0, fast = 0, highestSubstr = 0;
        Set<Character> set = new HashSet<>();
        // Move the fast pointer through the string
        while (fast < s.length()) {
            // If unique add to set and keep track of max value of substring
            if (!set.contains(s.charAt(fast))) {
                set.add(s.charAt(fast++));
                highestSubstr = Math.max(highestSubstr, set.size());
                // Otherwise if a value is found remove it from the set
                // and move pointer to check for the next duplicate value
            } else
                set.remove(s.charAt(slow++));
        }
        return highestSubstr;
    }
}

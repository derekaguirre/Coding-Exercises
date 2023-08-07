package Completed.TwoPointers.SlidingWindow;

import java.util.HashMap;
import java.util.Map;
//Submission: https://leetcode.com/problems/longest-repeating-character-replacement/submissions/1014275173/

public class LongestRepeatingCharReplacement {
    public int characterReplacement(String s, int k) {
        // holds all repeated characters
        Map<Character, Integer> charCountMap = new HashMap<>();
        int left = 0, maxRepeatCount = 0, maxWindow = 0;

        for (int right = 0; right < s.length(); right++) {
            // increase current char count
            char ch = s.charAt(right);
            // put character count in map
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);

            // max repeated char count
            maxRepeatCount = Math.max(maxRepeatCount, charCountMap.get(ch));

            int currentSizeOfWindow = right - left + 1;
            // if current size of the window - max repeated count greater than k (number of edits)
            if (currentSizeOfWindow - maxRepeatCount > k) {
                char charToDecrease = s.charAt(left);
                // decrease char count 
                charCountMap.put(charToDecrease, charCountMap.get(charToDecrease) - 1);
                left++;

                // update current size of window
                currentSizeOfWindow = right - left + 1;
            }

            maxWindow = Math.max(maxWindow, currentSizeOfWindow);
        }
        return maxWindow;
    }
}

package Completed.TwoPointers.SlidingWindow;

//Submission: https://leetcode.com/problems/permutation-in-string/submissions/1015164807/

public class CheckInclusion {
    public boolean checkInclusion(String s1, String s2) {
        if (s1 == null || s2 == null)
            return false;

        // Declare lengths in reusable variables
        int len1 = s1.length(), len2 = s2.length();
        if (len1 == 0)
            return true;
        if (len1 > len2)
            return false;

        int[] countMap = new int[26];
        for (int i = 0; i < len1; i++) {
            // Add chars of S1 in the window
            countMap[s1.charAt(i) - 'a']++;
            // Removing characters of S2 in the window
            countMap[s2.charAt(i) - 'a']--;
        }

        int count = 0;
        // Count chars which have a count of zero
        // Means either these chars are not present in window
        // or appear same no of times in window
        for (int i = 0; i < 26; i++) {
            if (countMap[i] == 0)
                count++;
        }
        // If count is 26, all S1 appear in the window for S2
        if (count == 26)
            return true;

        // Sliding window logic, start at len1 and bound it by len2
        for (int i = len1; i < len2; i++) {
            // Add new char in window
            int right = s2.charAt(i) - 'a';
            countMap[right]--;
            // Check if character exists, if so increment count, otherwise decrement count
            if (countMap[right] == 0)
                count++;
            else if (countMap[right] == -1)
                count--;

            // Removing old char from the window
            int left = s2.charAt(i - len1) - 'a';
            countMap[left]++;
            // Check if character exists, if so increment count, otherwise decrement count
            if (countMap[left] == 0)
                count++;
            else if (countMap[left] == 1)
                count--;

            if (count == 26)
                return true;
        }
        return false;
    }
}
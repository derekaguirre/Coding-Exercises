package Completed.Array;

class Solution {

    // I CAN SOLVE IT WITH SUBSTRINGS AS WELL
    // using substrings to check will shorten computation time.

    // Problem: https://leetcode.com/problems/greatest-common-divisor-of-strings/
    // Submission: https://leetcode.com/submissions/detail/944681282/

    public String gcdOfStrings(String str1, String str2) {
        // String str2Substring = "";
        // Check if divisible or empty
        if (str1.length() % str2.length() != 0 || str2.length() == 0 || str1.length() == 0) {
            return "";
        }

        // pointer for second string
        int str2Iter = 0;
        // I want to make the loop reset only the string 2 when iterating
        // iterate through the longer string
        for (int i = 0; i < str1.length(); i++) {
            // reset the second pointer if it reaches the length of str2
            if (str2Iter >= str2.length()) {
                str2Iter = 0;
            }

            // Compare the contents of the strings if no match, return
            // Keep iterating if matches are found
            if (str1.charAt(i) != str2.charAt(str2Iter)) {
                return "";
            } else {
                str2Iter++;
            }

            if (str2.length() % 2 == 0) {
                return str2.substring(0, (str2.length() / 2));
            }
            if (str2.length() % 3 == 0) {
                return str2.substring(0);
            }

        }
        return "";
    }
}
package Completed.TwoPointers;

//Submission: https://leetcode.com/problems/palindrome-number/submissions/964136631/

public class IsPalindrome {
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int pointer1 = 0;
        int pointer2 = s.length() - 1;

        while (pointer1 <= pointer2) {
            if (s.charAt(pointer1) != s.charAt(pointer2))
                return false;
            pointer1++;
            pointer2--;
        }
        return true;
    }
}

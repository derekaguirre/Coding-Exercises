package Completed.TwoPointers;

//Submission: https://leetcode.com/problems/palindrome-number/submissions/964136631/
//Submission 2: https://leetcode.com/problems/valid-palindrome/submissions/1175908667

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

    public static boolean isPalindrome2(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int front = 0;
        int back = s.length() - 1;
        while (front <= back) {
            // If they're not equal then its not a palindrome
            if (s.charAt(front++) != s.charAt(back--))
                return false;
        }
        return true;
    }
}

package Completed;

//Submission:  https://leetcode.com/problems/valid-palindrome/submissions/1003076543/

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome2("A man, a plan, a canal: Panama"));
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // 2nd Implementation
    public static boolean isPalindrome2(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int front = 0;
        int back = s.length()-1;
        while (front <= back) {
            if(s.charAt(front) != s.charAt(back))
                return false;
            front++;
            back--;
        }
        return true;
    }
}

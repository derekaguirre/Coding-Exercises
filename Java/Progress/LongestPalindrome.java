package Progress;

//Problem: https://leetcode.com/problems/longest-palindromic-substring/description/

public class LongestPalindrome {
    public static void main(String[] args) {
        // System.out.println(longestPalindrome("aacabdkacaa"));
    }

    public static String longestPalindrome(String s) {
        // If string is short
        if (s.length() == 1)
            return s;
        if (s.length() == 2 && s.charAt(0) != s.charAt(1)) {
            return String.valueOf(s.charAt(0));
        }
        // Sliding window approach
        // babad = len5
        char[] charArr = s.toCharArray();
        String tmpStr = "";
        int front = 0;
        while (front < charArr.length - 1) {
            int back = charArr.length - 1;
            while (back > 0) {
                // If they match,
                if (charArr[front] == charArr[back] && charArr[front + 1] == charArr[back - 1]) {
                    tmpStr = s.substring(front, back + 1);
                    front = charArr.length;
                    break;
                }
                back--;
            }
            front++;
        }

        return tmpStr;
    }


}

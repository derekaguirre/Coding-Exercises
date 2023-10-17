package Completed.TwoPointers;

//Submission: https://leetcode.com/submissions/detail/776461170/
//Submission2: https://leetcode.com/problems/reverse-string/submissions/1076364810/

public class ReverseString {

    public static void main(String[] args) {
        char[] s = { 'o', 'l', 'l', 'e' };
        reverseString(s);
        for (int i = 0; i < s.length; i++) {
            System.out.println("FINAL EVAL" + s[i]);
        }
    }

    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    // O(n) time
    // O(1) space
    public static void reverseString2(char[] s) {
        int front = 0, back = s.length - 1;
        while (front <= back) {
            char tmpFront = s[front];
            s[front] = s[back];
            s[back] = tmpFront;
            front++;
            back--;
        }
    }
}

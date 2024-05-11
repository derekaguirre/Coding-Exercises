package Completed.Strings;

//Submission: https://leetcode.com/problems/shifting-letters/submissions/1254848122

public class ShiftingLetters {
    public static void main(String[] args) {
        System.out.println(shiftingLetters("abc", new int[] { 3, 5, 9 }));
    }

    public static String shiftingLetters(String s, int[] shifts) {
        // calculate the total shifts starting backwards and adding the later one to the prev
        for (int i = shifts.length - 1; i > 0; --i) {
            shifts[i - 1] += shifts[i]; // add up the shift
            shifts[i - 1] %= 26; // check for integer overflow
        }
        char[] charArr = s.toCharArray();
        for (int i = 0; i < s.length(); ++i) {
            charArr[i] = (char) ('a' + (charArr[i] - 'a' + shifts[i]) % 26);
        }
        return String.valueOf(charArr);
    }
}

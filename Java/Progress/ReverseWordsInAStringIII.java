package Progress;

//Submission: https://leetcode.com/problems/reverse-words-in-a-string-iii/submissions/1089407639/

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        // Stack<Character> stack = new Stack<Character>();
        String[] subStrings = s.split(" ");
        for (int i = 0; i < subStrings.length; i++) {
            // Traverse the characters of substrings
            char[] subStringChars = subStrings[i].toCharArray();
            int end = subStringChars.length - 1;
            int start = 0;
            while (end > start) {
                char tmp = subStringChars[start];
                subStringChars[start] = subStringChars[end];
                subStringChars[end] = tmp;
                end--;
                start++;
            }
            subStrings[i] = String.valueOf(subStringChars);
        }
        return String.join(" ", subStrings);
    }
}

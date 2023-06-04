public class Subsequence {

    // Submission: https://leetcode.com/problems/is-subsequence/submissions/949287552/?envType=study-plan&id=level-1
    public static void main(String[] args) {
        String s = "bb";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        if (s.length() > t.length())
            return false;

        if (s.equals("") && t.equals("") || s.equals("") && !t.equals(""))
            return true;

        int occurCount = 0;
        for (int i = 0; i < t.length();) {

            // increment pointers for both strings if current char of "s" matches current
            // char of "t" otherwise, only move the pointer in "t"
            if (s.charAt(occurCount) == t.charAt(i)) {
                occurCount++;
                i++;
            } else {
                i++;
            }

            // if occurrences are the same length as "s" return true
            if (occurCount == s.length())
                return true;
        }
        return false;
    }

}

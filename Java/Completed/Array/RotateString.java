package Completed.Array;

//Submission: https://leetcode.com/problems/rotate-string/submissions/955486324/

public class RotateString {
    public static void main(String[] args) {
        rotateString("abcde", "cdeab");
    }
    public static boolean rotateString(String s, String goal) {
        if (s.equals(goal))
            return true;
        else if (s.length() == goal.length()) {
            String stringConcat = s + s;

            for (int i = 0; i <= goal.length() - 1; i++) {
                if (goal.equals(stringConcat.substring(i, i + goal.length())))
                    return true;
            }

        }
        return false;
    }
}

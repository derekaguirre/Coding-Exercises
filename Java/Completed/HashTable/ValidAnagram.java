package Completed.HashTable;

import java.util.Arrays;

//Submission: https://leetcode.com/problems/valid-anagram/submissions/986575630/


//Revisit
public class ValidAnagram {
    public static void main(String[] args) {
        String s = "car";
        String t = "rat";

        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        char[] sCharArr = s.toCharArray();
        char[] tCharArr = t.toCharArray();

        Arrays.sort(sCharArr);
        Arrays.sort(tCharArr);

        for (int i = 0; i < tCharArr.length; i++) {
            if (sCharArr[i] != tCharArr[i])
                return false;
        }
        return true;
    }
}

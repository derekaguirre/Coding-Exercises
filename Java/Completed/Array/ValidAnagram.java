package Completed.Array;

import java.util.Arrays;

//Submission: https://leetcode.com/problems/valid-anagram/submissions/986575630/
//Submission 2: https://leetcode.com/problems/valid-anagram/submissions/1171236867/

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
    //Space O(n)
    //Time O(n log n)
    public static boolean isAnagram2(String s, String t){
        //Check if they are the same size
        if(s.length() != t.length())
            return false;
        
        //Sort both strings
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        for (int i = 0; i < tArr.length; i++) {
            if(sArr[i] != tArr[i])
                return false;
        }
        return true;
    }
}

package Completed.HashTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Submission: https://leetcode.com/problems/buddy-strings/submissions/984922060/

public class BuddyStrings {
    public static void main(String[] args) {
        System.out.println(buddyStringsTwo("abcd", "cbad"));
    }

    public boolean buddyStrings(String s, String goal) {
        int m = s.length(), n = goal.length();
        if (m != n) {
            return false;
        }
        int diff = 0;
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for (int i = 0; i < n; ++i) {
            int a = s.charAt(i), b = goal.charAt(i);
            ++cnt1[a - 'a'];
            ++cnt2[b - 'a'];
            if (a != b) {
                ++diff;
            }
        }
        boolean f = false;
        for (int i = 0; i < 26; ++i) {
            if (cnt1[i] != cnt2[i]) {
                return false;
            }
            if (cnt1[i] > 1) {
                f = true;
            }
        }
        return diff == 2 || (diff == 0 && f);
    }

    public static boolean buddyStringsTwo(String s, String goal) {
        //False if the strings are not equal in length
        if (s.length() != goal.length())
            return false;

        //If both strings are equal and do not need swaps
        if (s.equals(goal)) {
            Set<Character> sSet = new HashSet<Character>();
            for (char c : s.toCharArray())
                sSet.add(c);
            return sSet.size() < s.length();
        }
        //If there are differences add the positions to a list
        List<Integer> dif = new ArrayList<>();
        for (int i = 0; i < s.length(); ++i)
            if (s.charAt(i) != goal.charAt(i))
                dif.add(i);
        //If there are more than 2 differences its false
        //If the first difference is not the same as the goal at the second difference its false
        return dif.size() == 2 && s.charAt(dif.get(0)) == goal.charAt(dif.get(1))
                && s.charAt(dif.get(1)) == goal.charAt(dif.get(0));
    }
}

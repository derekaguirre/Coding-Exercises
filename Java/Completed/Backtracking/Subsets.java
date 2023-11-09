package Completed.Backtracking;

import java.util.ArrayList;
import java.util.List;

//Submission: https://leetcode.com/problems/subsets/submissions/1090265724/

public class Subsets {
    public static void main(String[] args) {
        subsets(new int[] { 1, 2, 3 });
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();

        helper(resultList, new ArrayList<>(), nums, 0);
        return resultList;
    }

    private static void helper(List<List<Integer>> resultSets, List<Integer> tempSet, int[] nums, int start) {
        // Add the subset to the result set
        resultSets.add(new ArrayList<>(tempSet));
        for (int i = start; i < nums.length; i++) {
            tempSet.add(nums[i]);
            helper(resultSets, tempSet, nums, i + 1);

            tempSet.remove(tempSet.size() - 1);
        }
    }
}
